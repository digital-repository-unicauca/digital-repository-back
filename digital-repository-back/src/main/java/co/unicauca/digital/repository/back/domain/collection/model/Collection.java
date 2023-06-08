package co.unicauca.digital.repository.back.domain.collection.model;

import co.unicauca.digital.repository.back.domain.contract.model.Contract;
import co.unicauca.digital.repository.back.domain.document.model.Document;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private boolean isLocalRequerid;

    @Column(length = 250)
    private String createUser;

    private LocalDateTime createTime;

    @Column(length = 250)
    private String updateUser;

    private LocalDateTime updateTime;

    /** Contract Vendor */
    @ManyToOne
    @JoinColumn(name="contractId")
    private Contract contract;


    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL)
    private List<Document> documents;



//    @ManyToOne(mappedBy = "collections",cascade = CascadeType.ALL)
//    private ContractualDocument contractualDocument;
//
//    @ManyToOne(mappedBy = "collections",cascade = CascadeType.ALL)
//    private Contract contract;

}
