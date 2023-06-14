package co.unicauca.digital.repository.back.domain.contractualDocument.model;

import lombok.*;

import javax.persistence.*;

import co.unicauca.digital.repository.back.domain.contractualDocumentType.model.ContractualDocumentType;
import co.unicauca.digital.repository.back.domain.modalityContractType.model.ModalityContractType;

import java.time.LocalDateTime;

@Entity
@Table(name = "contractualDocument")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class ContractualDocument {

    /** ContractualDocument id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** ContractualDocument description */
    @Column(name = "Description")
    private String description;

    /** ContractualDocument isRequired */
    private Boolean isRequired;

    /** ContractualDocument subdirectory */
    @Column(name = "Subdirectory")
    private String subdirectory;

    /** ContractualDocument ordering */
    @Column(name = "Ordering")
    private Integer ordering;

    /** ContractualDocument createTime */
    @Column(name = "CreateTime")
    private LocalDateTime createTime;

    /** ContractualDocument createUser */
    @Column(length = 250, name = "CreateUser")
    private String createUser;

    /** ContractualDocument updateTime */
    @Column(name = "UpdateTime")
    private LocalDateTime updateTime;

    /** ContractualDocument updateUser */
    @Column(length = 250, name = "UpdateUser")
    private String updateUser;

    /** ContractualDocument modalityContractType */
    @ManyToOne(optional = false)
    @JoinColumn(name = "modalityContractTypeId")
    private ModalityContractType modalityContractType;

    /** ContractualDocument contractualDocumentType */
    @ManyToOne(optional = false)
    @JoinColumn(name = "contractualDocumentTypeId")
    private ContractualDocumentType contractualDocumentType;


}
