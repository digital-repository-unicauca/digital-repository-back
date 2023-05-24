package co.unicauca.digital.repository.back.domain.internalNormative.mapper;

<<<<<<< HEAD
import co.unicauca.digital.repository.back.domain.internalNormative.dto.request.InternalNormativeDtoCreateRequest;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.response.InternalNormativeDtoCreateResponse;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.response.InternalNormativeDtoFindResponse;
=======
import co.unicauca.digital.repository.back.domain.internalNormative.dto.request.InternalNormativeDtoRequest;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.response.InternalNormativeDtoResponse;
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
import co.unicauca.digital.repository.back.domain.internalNormative.model.InternalNormative;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IInternalNormativeMapper {

    @Mappings({
<<<<<<< HEAD
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "isInForce", source = "isInForce"),
            @Mapping(target = "initialTime", source = "initialTime"),
            @Mapping(target = "finalTime", source = "finalTime"),
            @Mapping(target = "createUser", source = "createUser"),
            @Mapping(target = "createTime", source = "createTime")
    })
    InternalNormativeDtoCreateResponse toDtoCreate(final InternalNormative internalNormative);

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "isInForce", source = "isInForce"),
            @Mapping(target = "initialTime", source = "initialTime"),
            @Mapping(target = "finalTime", source = "finalTime")
    })
    InternalNormativeDtoFindResponse toDtoFind(final InternalNormative internalNormative);
=======
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "isInForce", source = "isInForce"),
            @Mapping(target = "initialTime", source = "initialDate"),
            @Mapping(target = "finalDate", source = "finalDate")
    })
    InternalNormativeDtoResponse toDto(final InternalNormative internalNormative);
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2

    @Mappings({
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "isInForce", source = "isInForce"),
<<<<<<< HEAD
            @Mapping(target = "initialTime", source = "initialTime"),
            @Mapping(target = "finalTime", source = "finalTime")
    })
    InternalNormative toEntityCreate(final InternalNormativeDtoCreateRequest internalNormativeDtoCreateRequest);
=======
            @Mapping(target = "initialTime", source = "initialDate"),
            @Mapping(target = "finalDate", source = "finalDate")
    })
    InternalNormative toEntity(final InternalNormativeDtoRequest internalNormativeDtoRequest);
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
}
