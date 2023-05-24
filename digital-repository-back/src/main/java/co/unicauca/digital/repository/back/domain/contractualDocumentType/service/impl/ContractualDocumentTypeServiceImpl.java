package co.unicauca.digital.repository.back.domain.contractualDocumentType.service.impl;

import co.unicauca.digital.repository.back.domain.contractualDocumentType.dto.request.ContractualDocumentTypeDtoCreateRequest;
import co.unicauca.digital.repository.back.domain.contractualDocumentType.dto.response.ContractualDocumentTypeDtoCreateResponse;
import co.unicauca.digital.repository.back.domain.contractualDocumentType.mapper.IContractualDocumentTypeMapper;
import co.unicauca.digital.repository.back.domain.contractualDocumentType.model.ContractualDocumentType;
import co.unicauca.digital.repository.back.domain.contractualDocumentType.repository.IContractualDocumentTypeRepository;
import co.unicauca.digital.repository.back.domain.contractualDocumentType.service.IContractualDocumentTypeService;
import co.unicauca.digital.repository.back.global.response.Response;
import co.unicauca.digital.repository.back.global.response.handler.ResponseHandler;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Primary
public class ContractualDocumentTypeServiceImpl implements IContractualDocumentTypeService {

    /** Object to perform CRUD operations on the ContractualDocumentType entity */
    private final IContractualDocumentTypeRepository contractualDocumentTypeRepository;

    /** Mapping object for mapping the ContractualDocumentTypes */
    private final IContractualDocumentTypeMapper contractualDocumentTypeMapper;

    public ContractualDocumentTypeServiceImpl(IContractualDocumentTypeRepository contractualDocumentTypeRepository, IContractualDocumentTypeMapper contractualDocumentTypeMapper) {
        this.contractualDocumentTypeRepository = contractualDocumentTypeRepository;
        this.contractualDocumentTypeMapper = contractualDocumentTypeMapper;
    }

    @Override
    public Response<ContractualDocumentTypeDtoCreateResponse> createContractualDocumentType(ContractualDocumentTypeDtoCreateRequest contractualDocumentTypeDtoCreateRequest) {

        ContractualDocumentType contractualDocumentType = contractualDocumentTypeMapper.toEntityCreate(contractualDocumentTypeDtoCreateRequest);
        contractualDocumentType.setCreateTime(LocalDateTime.now());

        ContractualDocumentType contractualDocumentTypeSaved = this.contractualDocumentTypeRepository.save(contractualDocumentType);
        ContractualDocumentTypeDtoCreateResponse contractualDocumentTypeDtoCreateResponse = contractualDocumentTypeMapper.toDtoCreate(contractualDocumentTypeSaved);

        return new ResponseHandler<>(200, "Tipo de documento contractual creado exitosamente", "Tipo de documento contractual creado exitosamente", contractualDocumentTypeDtoCreateResponse).getResponse();


    }

}
