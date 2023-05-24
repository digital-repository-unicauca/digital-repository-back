package co.unicauca.digital.repository.back.domain.modalityContractType.mapper;

import co.unicauca.digital.repository.back.domain.modalityContractType.dto.request.ModalityContractTypeDtoRequest;
import co.unicauca.digital.repository.back.domain.modalityContractType.dto.response.ModalityContractTypeDtoResponse;
import co.unicauca.digital.repository.back.domain.modalityContractType.model.ModalityContractType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IModalityContractTypeMapper {

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "modalityId", source = "modalityId"),
            @Mapping(target = "contracttypeId", source = "contracttypeId"),
            @Mapping(target = "internalnomativeI", source = "internalnormativeId"),
            @Mapping(target = "createUser", source = "createUser"),
            @Mapping(target = "createTime", source = "createTime")
    })
    ModalityContractTypeDtoResponse toDto(final ModalityContractType modalityContractType);

    @Mappings({
            @Mapping(target = "modalityId", source = "modalityId"),
            @Mapping(target = "contracttypeId", source = "contracttypeId"),
            @Mapping(target = "internalnomativeId", source = "internalnormativeId")
    })
    ModalityContractType toEntity(final ModalityContractTypeDtoRequest requestDto);
}
