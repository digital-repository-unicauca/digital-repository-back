package co.unicauca.digital.repository.back.domain.contractType.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;


/**
 * This class defines the an entity for th O/R mapping of the ContractType table
 */
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ContractType {
    
    /*ContractType ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /*ContractType name */
    @Column(length = 250)
    private String name;

    /*ContractType description */
    private String description;

    /*ContractType external code */
    @Column(length = 250, unique = true)
    private String externalCode;

    /*ContractType create time */
    private LocalDateTime createTime;

    /*ContractType create user */
    @Column(length = 250)
    private String createUser;

    /*ContractType update time */
    private LocalDateTime updateTime;

    /*ContractType update user */
    @Column(length = 250)
    private String updateUser;
}