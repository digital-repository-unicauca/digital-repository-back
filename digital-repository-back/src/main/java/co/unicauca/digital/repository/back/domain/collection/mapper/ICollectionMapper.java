package co.unicauca.digital.repository.back.domain.collection.mapper;

import co.unicauca.digital.repository.back.domain.collection.dto.request.CollectionDtoRequest;
import co.unicauca.digital.repository.back.domain.collection.dto.response.CollectionDtoResponse;
import co.unicauca.digital.repository.back.domain.collection.model.Collection;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICollectionMapper {
    @Mappings({
    })
    CollectionDtoResponse toDto(final Collection collection);
    List<CollectionDtoResponse> toCollectionList(List<Collection> collectionList);

    @InheritInverseConfiguration

    Collection toEntity(final CollectionDtoRequest collectionDtoRequest);

}
