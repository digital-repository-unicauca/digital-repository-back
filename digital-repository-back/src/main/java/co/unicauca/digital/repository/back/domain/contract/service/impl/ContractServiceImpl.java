package co.unicauca.digital.repository.back.domain.contract.service.impl;

import co.unicauca.digital.repository.back.domain.contract.dto.request.ContractDtoCreateRequest;
import co.unicauca.digital.repository.back.domain.contract.dto.request.ContractDtoUpdateRequest;
import co.unicauca.digital.repository.back.domain.contract.dto.response.ContractDtoCreateResponse;
import co.unicauca.digital.repository.back.domain.contract.dto.response.ContractDtoFindResponse;
import co.unicauca.digital.repository.back.domain.contract.mapper.IContractMapper;
import co.unicauca.digital.repository.back.domain.contract.model.Contract;
import co.unicauca.digital.repository.back.domain.contract.repository.IContractRepository;
import co.unicauca.digital.repository.back.domain.contract.service.IContractService;
import co.unicauca.digital.repository.back.domain.vendor.model.Vendor;
import co.unicauca.digital.repository.back.domain.vendor.repository.IVendorRepository;
import co.unicauca.digital.repository.back.global.exception.BusinessRuleException;
import co.unicauca.digital.repository.back.global.response.PageableResponse;
import co.unicauca.digital.repository.back.global.response.Response;
import co.unicauca.digital.repository.back.global.response.handler.ResponseHandler;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/** Class in charge of implementing the IContractService interface {@link IContractService} */
@Service
@Primary
public class ContractServiceImpl implements IContractService {

    /** Object to perform CRUD operations on the Product entity */
    private final IContractRepository contractRepository;

    /** Object to perform CRUD operations on the Product entity */
    private final IVendorRepository vendorRepository;

    /** Mapping object for mapping the products */
    private final IContractMapper contractMapper;

    /**
     * constructor method
     */
    public ContractServiceImpl(IContractRepository contractRepository, IVendorRepository vendorRepository, IContractMapper contractMapper) {
        this.contractRepository = contractRepository;
        this.vendorRepository = vendorRepository;
        this.contractMapper = contractMapper;
    }

    /**
     * @see IContractService#getById(int)
     */
    @Override
    public Response<ContractDtoFindResponse> getById(int id) {
        Optional<Contract> contractFound = this.contractRepository.findById(id);
        if (contractFound.isEmpty()) throw new BusinessRuleException("contract.request.not.found");
        ContractDtoFindResponse contractDtoFindResponse = contractMapper.toDtoFind(contractFound.get());


        return new ResponseHandler<>(200, "Encontrado", "Encontrado", contractDtoFindResponse).getResponse();
    }

    /**
     * @see IContractService#getAll(int,int)
     */
    @Override
    public Response<PageableResponse<Object>> getAll(int pageNo, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
        Page<Contract> responsePage = contractRepository.findAll(pageRequest);

        List<Object> contractDtoFindResponses = responsePage.get().map(
                contractMapper::toDtoFind
        ).collect(Collectors.toList());

        PageableResponse<Object> response = PageableResponse.builder()
                .data(contractDtoFindResponses)
                .pageNo(responsePage.getNumber())
                .pageSize(responsePage.getSize())
                .totalElements(responsePage.getTotalElements())
                .totalPages(responsePage.getTotalPages())
                .last(responsePage.isLast())
                .build();

        return new ResponseHandler<>(200, "Exitoso", "Exitoso", response).getResponse();
    }

    /**
     * @see IContractService#createContract(ContractDtoCreateRequest)
     */
    @Override
    public Response<ContractDtoCreateResponse> createContract(ContractDtoCreateRequest contractDtoCreateRequest) {
        if(entityExistsByIdentification(contractDtoCreateRequest.getReference())) throw new BusinessRuleException("contract.request.already.exists");

        Contract contractModel = contractMapper.toEntityCreate(contractDtoCreateRequest);
        contractModel.setCreateTime(LocalDateTime.now());

        // Set Vendor
        Optional<Vendor> vendor = vendorRepository.findById(contractDtoCreateRequest.getVendor());
        if (vendor.isEmpty()) throw new BusinessRuleException("contractualDocumentTypeRequest.vendor.field.error");
        contractModel.setVendor(vendor.get());

        // TODO Set create user
        Contract contractSaved = this.contractRepository.save(contractModel);
        ContractDtoCreateResponse contractDtoCreateResponse = contractMapper.toDtoCreate(contractSaved);

        return new ResponseHandler<>(200, "Contratista creado exitosamente", "Contratista creado exitosamente", contractDtoCreateResponse).getResponse();
    }

    /**
     * @see IContractService#updateContract(ContractDtoUpdateRequest)
     */
    @Override
    public Response<ContractDtoCreateResponse> updateContract(ContractDtoUpdateRequest contractDtoUpdateRequest) {
        Optional<Contract> contract = contractRepository.findById(contractDtoUpdateRequest.getId());

        if (contract.isEmpty()) throw new BusinessRuleException("contract.request.not.found");

        Contract updateContract = Contract.builder()
                .id(contract.get().getId())
                .reference(contractDtoUpdateRequest.getReference())
                .signingDate(contractDtoUpdateRequest.getSigningDate())
                .initialDate(contractDtoUpdateRequest.getInitialDate())
                .finalDate(contractDtoUpdateRequest.getFinalDate())
                .status(contractDtoUpdateRequest.getStatus())
                .subject(contractDtoUpdateRequest.getSubject())
                .createUser(contract.get().getCreateUser())
                .createTime(contract.get().getCreateTime())
                .updateTime(LocalDateTime.now())
                // TODO .updateUser(XXX)
                .build();

        Contract contractSaved = this.contractRepository.save(updateContract);
        ContractDtoCreateResponse contractDtoCreateResponse = contractMapper.toDtoCreate(contractSaved);

        return new ResponseHandler<>(200, "Contratista actualizado exitosamente", "Contratista actualizado exitosamente", contractDtoCreateResponse).getResponse();
    }

    /**
     * @see IContractService#deleteContract(int)
     */
    @Override
    public Response<Boolean> deleteContract(int id) {
        Optional<Contract> contract = contractRepository.findById(id);

        if (contract.isEmpty()) throw new BusinessRuleException("contract.request.not.found");
        contractRepository.deleteById(id);

        return new ResponseHandler<>(200, "Contratista eliminado exitosamente", "Contratista eliminado exitosamente", !contractRepository.existsById(id)).getResponse();
    }

    /**
     * Check if the ContractDtoCreateRequest already exists
     *
     * @param reference the request to be validated
     * @return true if the entity exists
     */
    private boolean entityExistsByIdentification(final String reference) {
        return contractRepository.findByReference(reference).isPresent();
    }
}
