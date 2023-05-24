package co.unicauca.digital.repository.back.domain.modalityContractType.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Class that defines an entity for the O/R mapping of the MODALITYCONTRACTTYPE table.
 */
@Entity @Table(name = "modalitycontracttype")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ModalityContractType {

    /** ModalityContractType id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** ModalityContractType ModalityId */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_modality_modalitycontracttype"), name = "modality_id", referencedColumnName = "id", columnDefinition = "Integer")
    private Modality modalityId;

    /** ModalityContractType ContractTypeId */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_contracttype_modalitycontracttype"), name = "contracttype_id", referencedColumnName = "id", columnDefinition = "Integer")
    private ContractType contractTypeId;

    /** ModalityContractType InternalNormativeId */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_internalnormative_modalitycontracttype"), name = "internalnormative_id", referencedColumnName = "id", columnDefinition = "Integer")
    private InternalNormative internalNormativeId;

    /** ModalityContractType create User */
    @Column(length = 250)
    private String createUser;

    /** ModalityContractType create time  */
    private LocalDateTime createTime;

    /** ModalityContractType last update user */
    @Column(length = 250)
    private String updateUser;

    /** ModalityContractType last update time */
    private LocalDateTime updateTime;

}
