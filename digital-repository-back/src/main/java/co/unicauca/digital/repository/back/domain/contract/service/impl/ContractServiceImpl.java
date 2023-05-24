package co.unicauca.digital.repository.back.domain.contract.service.impl;

import co.unicauca.digital.repository.back.domain.contract.dto.request.ContractDtoCreateRequest;
import co.unicauca.digital.repository.back.domain.contract.dto.response.ContractDtoResponse;
import co.unicauca.digital.repository.back.domain.contract.mapper.IContractMapper;
import co.unicauca.digital.repository.back.domain.contract.model.Contract;
import co.unicauca.digital.repository.back.domain.contract.repository.IContractRepository;
import co.unicauca.digital.repository.back.domain.contract.service.IContractService;
import co.unicauca.digital.repository.back.global.exception.BusinessRuleException;
import co.unicauca.digital.repository.back.global.response.Response;
import co.unicauca.digital.repository.back.global.response.handler.ResponseHandler;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/** Class in charge of implementing the IContractService interface {@link IContractService} */
@Service
@Primary
public class ContractServiceImpl implements IContractService {

    /** Object to perform CRUD operations on the Product entity */
    private final IContractRepository contractRepository;

    /** Mapping object for mapping the products */
    private final IContractMapper contractMapper;

    /**
     * constructor method
     */
    public ContractServiceImpl(IContractRepository contractRepository, IContractMapper contractMapper) {
        this.contractRepository = contractRepository;
        this.contractMapper = contractMapper;
    }

    /**
     * @see IContractService#createContract(ContractDtoCreateRequest)
     */
    @Override
    public Response<ContractDtoResponse> createContract(final ContractDtoCreateRequest contractDtoRequest) {

        if(isInvalidReferenceFormat(contractDtoRequest.getReference())) throw new BusinessRuleException("bad.request.contract.format");

        Contract contractModel = contractMapper.toEntity(contractDtoRequest);
        Contract contractSaved = this.contractRepository.save(contractModel);
        ContractDtoResponse contractDtoResponse = contractMapper.toDto(contractSaved);


        return new ResponseHandler<>(200, "Contrato creado exitosamente", "Contrato creado exitosamente", contractDtoResponse).getResponse();
    }


    /**
     * Check if the input reference of the contract is in a valid format
     *
     * @param reference the input reference of the contract
     * @return true if the format is invalid or false if the format is valid
     */
    private boolean isInvalidReferenceFormat(final String reference) {
        return !reference.matches("^5.*");
    }


}
