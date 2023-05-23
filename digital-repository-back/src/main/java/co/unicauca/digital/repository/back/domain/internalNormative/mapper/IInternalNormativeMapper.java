package co.unicauca.digital.repository.back.domain.internalNormative.mapper;

import co.unicauca.digital.repository.back.domain.internalNormative.dto.request.InternalNormativeDtoRequest;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.response.InternalNormativeDtoResponse;
import co.unicauca.digital.repository.back.domain.internalNormative.model.InternalNormative;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IInternalNormativeMapper {

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "isInForce", source = "isInForce"),
            @Mapping(target = "initialTime", source = "initialDate"),
            @Mapping(target = "finalDate", source = "finalDate")
    })
    InternalNormativeDtoResponse toDto(final InternalNormative internalNormative);

    @Mappings({
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "isInForce", source = "isInForce"),
            @Mapping(target = "initialTime", source = "initialDate"),
            @Mapping(target = "finalDate", source = "finalDate")
    })
    InternalNormative toEntity(final InternalNormativeDtoRequest internalNormativeDtoRequest);
}
