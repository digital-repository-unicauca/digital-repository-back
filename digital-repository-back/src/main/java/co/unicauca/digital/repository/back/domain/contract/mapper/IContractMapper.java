package co.unicauca.digital.repository.back.domain.contract.mapper;

import co.unicauca.digital.repository.back.domain.contract.dto.request.ContractDtoCreateRequest;
import co.unicauca.digital.repository.back.domain.contract.dto.response.ContractDtoCreateResponse;
import co.unicauca.digital.repository.back.domain.contract.dto.response.ContractDtoFindContractualFoldersResponse;
import co.unicauca.digital.repository.back.domain.contract.dto.response.ContractDtoFindResponse;
import co.unicauca.digital.repository.back.domain.contract.model.Contract;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * Class that defines the mapper in charge of the O/R transition to a DTO object.
 */
@Mapper(componentModel = "spring")
public interface IContractMapper {
    @Mappings({
            @Mapping(target = "reference", source = "reference"),
            @Mapping(target = "signingDate", source = "signingDate"),
            @Mapping(target = "initialDate", source = "initialDate"),
            @Mapping(target = "finalDate", source = "finalDate"),
            @Mapping(target = "status", source = "status"),
            @Mapping(target = "subject", source = "subject"),
            @Mapping(target = "createUser", source = "createUser"),
            @Mapping(target = "createTime", source = "createTime")
    })
    ContractDtoCreateResponse toDtoCreate(final Contract contract);

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "reference", source = "reference"),
            @Mapping(target = "initialDate", source = "initialDate"),
            @Mapping(target = "finalDate", source = "finalDate"),
            @Mapping(target = "status", source = "status"),
            @Mapping(target = "vendor", ignore = true),
            @Mapping(target = "subject", source = "subject"),
            @Mapping(target = "modalityContractType", ignore = true)
    })
    ContractDtoFindResponse toDtoFind(final Contract contract);

    @Mappings({
            @Mapping(target = "reference", source = "reference"),
            @Mapping(target = "signingDate", source = "signingDate"),
            @Mapping(target = "initialDate", source = "initialDate"),
            @Mapping(target = "finalDate", source = "finalDate"),
            @Mapping(target = "status", source = "status"),
            @Mapping(target = "subject", source = "subject"),
            @Mapping(target = "vendor", ignore = true),
            @Mapping(target = "modalityContractType", ignore = true)
    })
    Contract toEntityCreate(final ContractDtoCreateRequest contractDtoCreateRequest);


    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "reference", source = "reference"),
            @Mapping(target = "modality", ignore = true),
            @Mapping(target = "contractType", ignore = true),
            @Mapping(target = "vendor", ignore = true),
            @Mapping(target = "signingYear", ignore = true)
    })
    ContractDtoFindContractualFoldersResponse toDtoFindContractualFolders(final Contract contract);

}
