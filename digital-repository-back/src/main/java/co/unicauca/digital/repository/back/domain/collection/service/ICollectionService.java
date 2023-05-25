package co.unicauca.digital.repository.back.domain.collection.service;

import co.unicauca.digital.repository.back.domain.collection.dto.request.CollectionDtoRequest;
import co.unicauca.digital.repository.back.domain.collection.dto.response.CollectionDtoResponse;
import co.unicauca.digital.repository.back.global.response.PageableResponse;
import co.unicauca.digital.repository.back.global.response.Response;

public interface ICollectionService {
    /**
     *
     * @param collectionDtoRequest
     * @return
     */
    Response<CollectionDtoResponse> createCollection(final CollectionDtoRequest collectionDtoRequest);

    /**
     *
     * @param id
     * @return
     */
    Response<CollectionDtoResponse> getByIdCollection(Integer id);

    /**
     *
     * @param pageNumber
     * @param pagezise
     * @return
     */
    Response<PageableResponse<Object>> getAll(int pageNumber, int pagezise);

    /**
     *
     * @param collectionDtoRequest
     * @return
     */
    Response<CollectionDtoResponse> update(final CollectionDtoRequest collectionDtoRequest);

    /**
     *
     * @param id
     * @return
     */
    Response<Boolean> delete(Integer id);
}
