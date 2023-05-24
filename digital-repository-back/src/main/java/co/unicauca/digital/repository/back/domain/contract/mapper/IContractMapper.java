package co.unicauca.digital.repository.back.domain.contract.mapper;

import co.unicauca.digital.repository.back.domain.contract.dto.request.ContractDtoCreateRequest;
import co.unicauca.digital.repository.back.domain.contract.dto.response.ContractDtoResponse;
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
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "reference", source = "reference")
    })
    ContractDtoResponse toDto(final Contract contract);

    @Mappings({
            @Mapping(target = "reference", source = "reference")
    })
    Contract toEntity(final ContractDtoCreateRequest requestDto);

}
