package co.unicauca.digital.repository.back.domain.collection.service;

import co.unicauca.digital.repository.back.domain.collection.dto.request.CollectionDtoRequest;
import co.unicauca.digital.repository.back.domain.collection.dto.response.CollectionDtoResponse;
import co.unicauca.digital.repository.back.global.response.Response;
import org.springframework.data.domain.Page;

public interface ICollectionService {
    Response<CollectionDtoResponse> createCollection(final CollectionDtoRequest collectionDtoRequest);
    Response<CollectionDtoResponse> getByIdCollection(Integer id);
    Response<Page<CollectionDtoResponse>> getAll(int pageNumber, int pagezise);
    Response<CollectionDtoResponse> update(final CollectionDtoRequest collectionDtoRequest);
    Response<CollectionDtoResponse> delete(Integer id);
}
