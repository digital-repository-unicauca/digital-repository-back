package co.unicauca.digital.repository.back.domain.document.repository;

import co.unicauca.digital.repository.back.domain.document.dto.response.DocumentDtoResponse;
import co.unicauca.digital.repository.back.domain.document.model.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface IDocumentRepository extends JpaRepository<Document, Integer> {
    Page<DocumentDtoResponse> findAll(Pageable pageable);
}
