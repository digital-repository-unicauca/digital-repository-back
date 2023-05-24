package co.unicauca.digital.repository.back.domain.internalNormative.service;

<<<<<<< HEAD
import co.unicauca.digital.repository.back.domain.internalNormative.dto.request.InternalNormativeDtoCreateRequest;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.request.InternalNormativeDtoUpdateRequest;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.response.InternalNormativeDtoCreateResponse;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.response.InternalNormativeDtoFindResponse;
import co.unicauca.digital.repository.back.global.response.PageableResponse;
=======
import co.unicauca.digital.repository.back.domain.internalNormative.dto.request.InternalNormativeDtoRequest;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.response.InternalNormativeDtoResponse;
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
import co.unicauca.digital.repository.back.global.response.Response;

import java.util.ArrayList;

/**
 * Interface that allows defining the business operations to be carried out on the Internal Normative entity.
 */
public interface IInternalNormativeService {

    /**
     * Service to save a internal normative
     *
<<<<<<< HEAD
     *@param internalNormativeDtoCreateRequest {@link InternalNormativeDtoCreateRequest} Object with the information to be inserted, received in the body of the request to the service
     *@return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<InternalNormativeDtoCreateResponse> createInternalNormative(final InternalNormativeDtoCreateRequest internalNormativeDtoCreateRequest);
=======
     *@param internalNormativeDtoRequest {@link InternalNormativeDtoRequest} Object with the information to be inserted, received in the body of the request to the service
     *@return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<InternalNormativeDtoResponse> createInternalNormative(final InternalNormativeDtoRequest internalNormativeDtoRequest);
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2

    /**
     * Service to get an internal normative by id
     *
<<<<<<< HEAD
     *@param id {@link Integer} ID Object to do the search
     *@return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<InternalNormativeDtoFindResponse> getById(final Integer id);
=======
     *@param id {@link Integer} Object with the information to be inserted, received in the body of the request to the service
     *@return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<InternalNormativeDtoResponse> getById(final Integer id);
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2

    /**
     * Service to get all records from internal normative table
     *
<<<<<<< HEAD
     * @param pageNo Pagination Page number
     * @param pageSize Pagination Page size
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<PageableResponse<Object>> getAll(int pageNo, int pageSize);
=======
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<ArrayList<InternalNormativeDtoResponse>> getAll();
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2

    /**
     * Service to update a internal normative
     *
<<<<<<< HEAD
     *@param internalNormativeDtoUpdateRequest {@link InternalNormativeDtoUpdateRequest} Object with the information to be updated, received in the body
     *@return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<InternalNormativeDtoCreateResponse> updateInternalNormative(final InternalNormativeDtoUpdateRequest internalNormativeDtoUpdateRequest);
=======
     *@param internalNormativeDtoRequest {@link InternalNormativeDtoRequest} Object with the information to be inserted, received in the body of the request to the service
     *@return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<InternalNormativeDtoResponse> updateInternalNormative(final InternalNormativeDtoRequest internalNormativeDtoRequest);
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2

    /**
     * Service to delete an internal normative by id
     *
<<<<<<< HEAD
     *@param id {@link Integer} ID Object with the information to be deleted
=======
     *@param id {@link Integer} Object with the information to be inserted, received in the body of the request to the service
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
     *@return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<Boolean> deleteInternalNormative(final Integer id);

}
