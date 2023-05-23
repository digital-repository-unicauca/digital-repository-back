package co.unicauca.digital.repository.back.domain.document.rest;

import co.unicauca.digital.repository.back.domain.document.dto.request.DocumentDtoRequest;
import co.unicauca.digital.repository.back.domain.document.dto.response.DocumentDtoResponse;
import co.unicauca.digital.repository.back.domain.document.service.IDocumentService;
import co.unicauca.digital.repository.back.global.response.Response;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.print.Pageable;
import java.util.ArrayList;

@RestController
@RequestMapping("/document")
@Validated
public class DocumentController {
    private final IDocumentService documentService;

    public DocumentController(IDocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping
    public ResponseEntity<Response<DocumentDtoResponse>> createDocument(@Valid @RequestBody final DocumentDtoRequest documentDtoRequest){
        return new ResponseEntity<>(this.documentService.createDocument(documentDtoRequest), HttpStatus.OK);
    }

    @GetMapping("/{documentId}")
    public ResponseEntity<Response<DocumentDtoResponse>> getByIdDocument(@PathVariable("documentId") int id){
        return new ResponseEntity<>(this.documentService.getByIdDocoment(id),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Response<Page<DocumentDtoResponse>>> getAll(@RequestParam(defaultValue = "pageNumber") int pageNumber, @RequestParam(defaultValue = "pageZise") int pageSize){
        return new ResponseEntity<>(this.documentService.getAll(pageNumber,pageSize),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Response<DocumentDtoResponse>> update(@Valid @RequestBody DocumentDtoRequest documentDtoRequest){
        return new ResponseEntity<>(this.documentService.update(documentDtoRequest),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response<DocumentDtoResponse>> delete(@PathVariable int id){
        return new ResponseEntity<>(this.documentService.delete(id),HttpStatus.OK);
    }

}
