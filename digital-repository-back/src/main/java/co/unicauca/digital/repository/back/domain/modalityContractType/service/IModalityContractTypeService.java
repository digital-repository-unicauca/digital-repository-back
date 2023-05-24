package co.unicauca.digital.repository.back.domain.modalityContractType.service;

import co.unicauca.digital.repository.back.domain.modalityContractType.dto.request.ModalityContractTypeDtoRequest;
import co.unicauca.digital.repository.back.domain.modalityContractType.dto.response.ModalityContractTypeDtoResponse;
import co.unicauca.digital.repository.back.global.response.Response;

import java.util.ArrayList;

/**
 * Interface that allows defining the business operations to be carried out on the ModalityContractType entity.
 */
public interface IModalityContractTypeService {

    /**
     * Service to save a modalitycontracttype
     *
     * @param modalityContractTypeDtoRequest {@link ModalityContractTypeDtoRequest} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<ModalityContractTypeDtoResponse> createModalityContractType(final ModalityContractTypeDtoRequest modalityContractTypeDtoRequest);

    /**
     * Service to get a modalitycontracttype for id
     *
     * @param id {@link Integer} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<ModalityContractTypeDtoResponse> getById(final Integer id);

    /**
     * Service to get all records from modalitycontracttype table
     *
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<ArrayList<ModalityContractTypeDtoResponse>> getAll();

    /**
     * Service to update a modalitycontracttype
     *
     * @param modalityContractTypeDtoRequest {@link ModalityContractTypeDtoRequest} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<ModalityContractTypeDtoResponse> updateModalityContractType(final ModalityContractTypeDtoRequest modalityContractTypeDtoRequest);

    /**
     * Service to delete a modalitycontracttype for id
     *
     * @param id {@link Integer} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<Boolean> deleteModalityContractType(final Integer id);

}
