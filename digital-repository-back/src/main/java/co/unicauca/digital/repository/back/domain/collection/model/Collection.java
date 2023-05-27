package co.unicauca.digital.repository.back.domain.collection.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="collection")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Collection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer parentId;
    private boolean isLocalRequerid;
    @Column(length = 250)
    private String createUser;
    private LocalDateTime createTime;
    @Column(length = 250)
    private String updateUser;
    private LocalDateTime updateTime;

    /*
    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL)
    private List<Document> documents;

    @ManyToOne(mappeBy = "collections",cascade = CascadeType.ALL)
    private ContractualDocument contractualDocument;

    @ManyToOne(mappeBy = "collections",cascade = CascadeType.ALL)
    private Contract contract;
     */
}
