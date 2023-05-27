package co.unicauca.digital.repository.back.domain.modalityContractType.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Class that defines an entity for the O/R mapping of the MODALITY CONTRACT TYPE table.
 */
@Entity @Table(name = "modalityContractType")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ModalityContractType {

    /** ModalityContractType id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // TODO add relationships
    /* ModalityContractType ModalityId
    private Modality modalityId;
    */

    /* ModalityContractType ContractTypeId
    // private ContractType contractTypeId;
    */

    /* ModalityContractType InternalNormativeId
    // private InternalNormative internalNormativeId;
    */

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
