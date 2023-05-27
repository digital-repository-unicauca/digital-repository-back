package co.unicauca.digital.repository.back.domain.document.service;

import co.unicauca.digital.repository.back.domain.document.dto.request.DocumentDtoRequest;
import co.unicauca.digital.repository.back.domain.document.dto.response.DocumentDtoResponse;
import co.unicauca.digital.repository.back.global.response.PageableResponse;
import co.unicauca.digital.repository.back.global.response.Response;

/**
 * Interface that allows defining the business operations to be carried out on the Document entity.
 */
public interface IDocumentService {
    /**
     * Service to create a document.
     *
     * @param documentDtoRequest Object with the information to be created.
     * @return Response object for the service, containing information about the transaction outcome.
     */
    Response<DocumentDtoResponse> createDocument(final DocumentDtoRequest documentDtoRequest);

    /**
     * Service to get a document by ID.
     *
     * @param id ID of the document to retrieve.
     * @return Response object for the service, containing information about the transaction outcome.
     */
    Response<DocumentDtoResponse> getByIdDocument(Integer id);

    /**
     * Service to get all documents with pagination support.
     *
     * @param pageNumber Pagination page number.
     * @param pagezise Pagination page size.
     * @return Response object for the service, containing information about the transaction outcome.
     */
    Response<PageableResponse<Object>> getAll(int pageNumber, int pagezise);

    /**
     * Service to delete a document by ID.
     *
     * @param id ID of the document to delete.
     * @return Response object for the service, indicating whether the deletion was successful.
     */
    Response<Boolean> delete(Integer id);
}

