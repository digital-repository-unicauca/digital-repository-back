package co.unicauca.digital.repository.back.domain.internalNormative.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
<<<<<<< HEAD
 * Class that defines an entity for the O/R mapping of the INTERNAL NORMATIVE table.
 */
@Entity @Table(name = "internalNormative")
=======
 * Class that defines an entity for the O/R mapping of the INTERNALNORMATIVE table.
 */
@Entity @Table(name = "internalnormative")
>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class InternalNormative {

    /** InternalNormative id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** InternalNormative name */
    @Column(length = 250)
    private String name;

    /** InternalNormative isInForce */
    @Column(nullable = false)
    private Boolean isInForce;

    /** InternalNormative initialTime */
    @Column(nullable = false)
    private LocalDateTime initialTime;

    /** InternalNormative finalTime */
<<<<<<< HEAD
    private LocalDateTime finalTime;

    /** InternalNormative create User */
    @Column(length = 250)
    private String createUser;

    /** InternalNormative create time  */
    private LocalDateTime createTime;

    /** InternalNormative last update user */
    @Column(length = 250)
    private String updateUser;

    /** InternalNormative last update time */
    private LocalDateTime updateTime;

=======
    @Column
    private LocalDateTime finalTime;

>>>>>>> 84e160d4cc6c6319b34fa983f2aa14f6d5e6bad2
}
