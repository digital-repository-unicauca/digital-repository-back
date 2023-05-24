package co.unicauca.digital.repository.back.domain.contractualDocumentType.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Class that defines an entity for the O/R mapping of the CONTRACT table.
 */
@Entity
@Table(name = "contractualDocumentType")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class ContractualDocumentType {

    /** ContractualDocumentType id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** ContractualDocumentType name */
    @Column(length = 250, name = "Name")
    private String name;

    /** ContractualDocumentType description */
    @Column(name = "Description")
    private String description;

    /** ContractualDocumentType createTime */
    @Column(name = "CreateTime")
    private LocalDateTime createTime;

    /** ContractualDocumentType createUser */
    @Column(length = 250, name = "CreateUser")
    private String createUser;

    /** ContractualDocumentType updateTime */
    @Column(name = "UpdateTime")
    private LocalDateTime updateTime;

    /** ContractualDocumentType updateUser */
    @Column(length = 250, name = "UpdateUser")
    private String updateUser;
}
