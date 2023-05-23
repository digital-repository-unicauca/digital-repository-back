package co.unicauca.digital.repository.back.domain.internalNormative.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Class that defines an entity for the O/R mapping of the INTERNALNORMATIVE table.
 */
@Entity @Table(name = "internalnormative")
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
    @Column
    private LocalDateTime finalTime;

}
