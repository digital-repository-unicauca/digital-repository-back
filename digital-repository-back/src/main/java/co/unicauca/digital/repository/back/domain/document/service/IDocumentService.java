package co.unicauca.digital.repository.back.domain.document.service;

import co.unicauca.digital.repository.back.domain.document.dto.request.DocumentDtoRequest;
import co.unicauca.digital.repository.back.domain.document.dto.response.DocumentDtoResponse;
import co.unicauca.digital.repository.back.global.response.PageableResponse;
import co.unicauca.digital.repository.back.global.response.Response;

public interface IDocumentService {
    /**
     *
     * @param documentDtoRequest
     * @return
     */
    Response<DocumentDtoResponse> createDocument(final DocumentDtoRequest documentDtoRequest);

    /**
     *
     * @param id
     * @return
     */
    Response<DocumentDtoResponse> getByIdDocument(Integer id);

    /**
     *
     * @param pageNumber
     * @param pagezise
     * @return
     */
    Response<PageableResponse<Object>> getAll(int pageNumber, int pagezise);

    /**
     *
     * @param id
     * @return
     */
    Response<Boolean> delete(Integer id);
}
