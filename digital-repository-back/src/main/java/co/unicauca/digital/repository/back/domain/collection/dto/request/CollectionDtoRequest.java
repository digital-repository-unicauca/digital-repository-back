package co.unicauca.digital.repository.back.domain.collection.dto.request;

import co.unicauca.digital.repository.back.domain.document.model.Document;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CollectionDtoRequest {

    private Integer id;
    private boolean isLocalRequerid;
    @NotNull(message = "{reference.field.not.null}")
    @NotEmpty(message = "{reference.field.not.empty}")
    private String createUser;

    @NotNull(message = "{reference.field.not.null}")
    @NotEmpty(message = "{reference.field.not.empty}")
    private List<Document> documents;
//
//    @NotNull(message = "{reference.field.not.null}")
//    private ContractualDocument contractualDocument;
//
//    @NotNull(message = "{reference.field.not.null}")
//    private Contract contract;

}
