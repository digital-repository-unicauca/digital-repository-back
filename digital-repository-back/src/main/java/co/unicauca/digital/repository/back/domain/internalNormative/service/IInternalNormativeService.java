package co.unicauca.digital.repository.back.domain.internalNormative.service;

import co.unicauca.digital.repository.back.domain.internalNormative.dto.request.InternalNormativeDtoRequest;
import co.unicauca.digital.repository.back.domain.internalNormative.dto.response.InternalNormativeDtoResponse;
import co.unicauca.digital.repository.back.global.response.Response;

import java.util.ArrayList;

/**
 * Interface that allows defining the business operations to be carried out on the Internal Normative entity.
 */
public interface IInternalNormativeService {

    /**
     * Service to save a internal normative
     *
     *@param internalNormativeDtoRequest {@link InternalNormativeDtoRequest} Object with the information to be inserted, received in the body of the request to the service
     *@return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<InternalNormativeDtoResponse> createInternalNormative(final InternalNormativeDtoRequest internalNormativeDtoRequest);

    /**
     * Service to get an internal normative by id
     *
     *@param id {@link Integer} Object with the information to be inserted, received in the body of the request to the service
     *@return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<InternalNormativeDtoResponse> getById(final Integer id);

    /**
     * Service to get all records from internal normative table
     *
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<ArrayList<InternalNormativeDtoResponse>> getAll();

    /**
     * Service to update a internal normative
     *
     *@param internalNormativeDtoRequest {@link InternalNormativeDtoRequest} Object with the information to be inserted, received in the body of the request to the service
     *@return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<InternalNormativeDtoResponse> updateInternalNormative(final InternalNormativeDtoRequest internalNormativeDtoRequest);

    /**
     * Service to delete an internal normative by id
     *
     *@param id {@link Integer} Object with the information to be inserted, received in the body of the request to the service
     *@return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<Boolean> deleteInternalNormative(final Integer id);

}
