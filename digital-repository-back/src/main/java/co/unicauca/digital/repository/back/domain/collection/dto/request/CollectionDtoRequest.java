package co.unicauca.digital.repository.back.domain.collection.dto.request;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CollectionDtoRequest {
    private Integer id;
    @NotNull(message = "{reference.field.not.null}")
    private Integer parentId;
    private boolean isLocalRequerid;
    @NotNull(message = "{reference.field.not.null}")
    @NotEmpty(message = "{reference.field.not.empty}")
    private String createUser;
    @NotNull(message = "{reference.field.not.null}")
    private LocalDateTime createTime;
    @NotNull(message = "{reference.field.not.null}")
    @NotEmpty(message = "{reference.field.not.empty}")
    private String updateUser;
    @NotNull(message = "{reference.field.not.null}")
    private LocalDateTime updateTime;



    /*
    @NotNull(message = "{reference.field.not.null}")
    @NotEmpty(message = "{reference.field.not.empty}")
    private ArrayList<Document> documents;

    @NotNull(message = "{reference.field.not.null}")
    private ContractualDocument contractualDocument;

    @NotNull(message = "{reference.field.not.null}")
    private Contract contract;

     */
}
