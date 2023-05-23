package co.unicauca.digital.repository.back.domain.document.service.impl;

import co.unicauca.digital.repository.back.domain.document.dto.request.DocumentDtoRequest;
import co.unicauca.digital.repository.back.domain.document.dto.response.DocumentDtoResponse;
import co.unicauca.digital.repository.back.domain.document.mapper.IDocumentMapper;
import co.unicauca.digital.repository.back.domain.document.model.Document;
import co.unicauca.digital.repository.back.domain.document.repository.IDocumentRepository;
import co.unicauca.digital.repository.back.domain.document.service.IDocumentService;
import co.unicauca.digital.repository.back.global.response.Response;
import co.unicauca.digital.repository.back.global.response.handler.ResponseHandler;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DocumentServiceImpl implements IDocumentService {

    private final IDocumentRepository documentRepository;
    private final IDocumentMapper documentMapper;

    public DocumentServiceImpl(IDocumentRepository documentRepository, IDocumentMapper documentMapper) {
        this.documentRepository = documentRepository;
        this.documentMapper = documentMapper;
    }

    @Override
    public Response<DocumentDtoResponse> createDocument(DocumentDtoRequest documentDtoRequest) {

        return null;
    }

    @Override
    public Response<DocumentDtoResponse> getByIdDocoment(Integer id) {

        return null;
    }

    @Override
    public Response<Page<DocumentDtoResponse>> getAll(int pageNumber, int pagezise) {
        Pageable pageable = PageRequest.of(pageNumber,pagezise, Sort.by("type"));
        Page<Document> documents = this.documentRepository.findAll(pageable);
        List<DocumentDtoResponse> documentDtoResponseList = this.documentMapper.toDocumentList(documents.getContent());
        Page<DocumentDtoResponse> page = new PageImpl<>(documentDtoResponseList,pageable,documents.getTotalElements());
        return new ResponseHandler<>(200,"Pagina encontrada exitosamente", "",page).getResponse();
    }

    @Override
    public Response<DocumentDtoResponse> update(DocumentDtoRequest documentDtoRequest) {
        return null;
    }

    @Override
    public Response<DocumentDtoResponse> delete(Integer id) {
        return null;
    }
}
