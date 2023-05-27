package co.unicauca.digital.repository.back.domain.collection.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CollectionDtoResponse {
    private Integer id;
    private Integer parentId;
    private boolean isLocalRequerid;
    private String createUser;
    private LocalDateTime createTime;
    private String updateUser;
    private LocalDateTime updateTime;


    /*
    private ArrayList<Document> documents;

    private ContractualDocument contractualDocument;

    private Contract contract;

     */
}
