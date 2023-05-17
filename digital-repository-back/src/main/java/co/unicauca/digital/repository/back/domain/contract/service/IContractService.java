package co.unicauca.digital.repository.back.domain.contract.service;

import co.unicauca.digital.repository.back.domain.contract.dto.request.ContractDtoRequest;
import co.unicauca.digital.repository.back.domain.contract.dto.response.ContractDtoResponse;
import co.unicauca.digital.repository.back.global.response.Response;

/**
 * Interface that allows defining the business operations to be carried out on the Contract entity.
 */
public interface IContractService {

    /**
     * Service to save a contract
     *
     * @param contractDtoRequest {@link ContractDtoRequest} Object with the information to be inserted, received in the body of the request to the service
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<ContractDtoResponse> saveContract(final ContractDtoRequest contractDtoRequest);
}
