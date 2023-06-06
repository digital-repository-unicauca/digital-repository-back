package co.unicauca.digital.repository.back.domain.collection.model;

import co.unicauca.digital.repository.back.domain.contract.model.Contract;
import co.unicauca.digital.repository.back.domain.contractualDocument.model.ContractualDocument;
import co.unicauca.digital.repository.back.domain.document.model.Document;
import co.unicauca.digital.repository.back.domain.vendor.model.Vendor;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Collection parent;

    @Singular
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "parent")
    @JsonBackReference
    private List<Collection> sons;

    private boolean isLocalRequerid;

    @Column(length = 250)
    private String createUser;

    private LocalDateTime createTime;

    @Column(length = 250)
    private String updateUser;

    private LocalDateTime updateTime;

    /** Contract Vendor */
    @ManyToOne(optional = false)
    @JoinColumn(name="contractId")
    private Contract contract;

    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL)
    private List<Document> documents;

    //TODO: Verificar mapeo
    @OneToMany(mappedBy = "collection",cascade = CascadeType.ALL)
    private ContractualDocument contractualDocument;

}
