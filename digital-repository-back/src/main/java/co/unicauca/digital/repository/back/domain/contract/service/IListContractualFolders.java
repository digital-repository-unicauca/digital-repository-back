package co.unicauca.digital.repository.back.domain.contract.service;

import co.unicauca.digital.repository.back.global.response.PageableResponse;
import co.unicauca.digital.repository.back.global.response.Response;

/**
 * Interface that allows defining the business operations for the HE01 to be carried out on the Contract entity.
 */
public interface IListContractualFolders {

    /**
     * Service to get all contracts sort by update time descending
     *
     * @param pageNo Pagination Page number
     * @param pageSize Pagination Page size
     * @return {@link Response} Response object for the service, which contains information about the outcome of the transaction.
     */
    Response<PageableResponse<Object>> getContractualFoldersSortByUpdateDate(int pageNo, int pageSize);
}
