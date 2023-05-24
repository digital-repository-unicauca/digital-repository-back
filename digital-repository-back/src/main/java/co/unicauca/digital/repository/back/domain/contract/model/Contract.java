package co.unicauca.digital.repository.back.domain.contract.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDateTime;

/**
 * Class that defines an entity for the O/R mapping of the CONTRACT table.
 */
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Contract {

    /** Contract id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** Contract code */
    @Column(length = 250, unique = true)
    private String reference;

    /** Contract date of signature  */
    private LocalDateTime signingDate;

    /** Contract initial date */
    private LocalDateTime initialDate;

    /** Contract final date */
    private LocalDateTime finalDate;

    @Enumerated(EnumType.STRING)
    private ContractStatusEnum status;

    /** Contract subject */
    @Column(length = 250)
    private String subject;

    /** Contract create User */
    @Column(length = 250)
    private String createUser;

    /** Contract create time  */
    private LocalDateTime createTime;

    /** Contract last update user */
    @Column(length = 250)
    private String updateUser;

    /** Contract last update time */
    private LocalDateTime updateTime;

}

