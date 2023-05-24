package co.unicauca.digital.repository.back.domain.collection.dto.response;

import co.unicauca.digital.repository.back.domain.document.model.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class CollectionDtoResponse {
    private Integer id;

    private Integer parentId;
    private boolean isLocalRequerid;

    private String createUser;

    private LocalDateTime createTime;

    private String updateUser;

    private LocalDateTime updateTime;

    private ArrayList<Document> documents;

    private ContractualDocument contractualDocument;

    private Contract contract;
}
