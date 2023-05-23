package co.unicauca.digital.repository.back.domain.document.service;

import co.unicauca.digital.repository.back.domain.document.dto.request.DocumentDtoRequest;
import co.unicauca.digital.repository.back.domain.document.dto.response.DocumentDtoResponse;
import co.unicauca.digital.repository.back.global.response.Response;
import org.springframework.data.domain.Page;

import java.util.ArrayList;

public interface IDocumentService {
    Response<DocumentDtoResponse> createDocument(final DocumentDtoRequest documentDtoRequest);
    Response<DocumentDtoResponse> getByIdDocoment(Integer id);
    Response<Page<DocumentDtoResponse>> getAll(int pageNumber, int pagezise);
    Response<DocumentDtoResponse> update(final DocumentDtoRequest documentDtoRequest);

    Response<DocumentDtoResponse> delete(Integer id);
}
