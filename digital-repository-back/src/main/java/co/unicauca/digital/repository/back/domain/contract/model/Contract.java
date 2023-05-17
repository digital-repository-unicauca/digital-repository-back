package co.unicauca.digital.repository.back.domain.contract.model;

import lombok.*;

import javax.persistence.*;

/**
 * Class that defines an entity for the O/R mapping of the CONTRACT table.
 */
@Entity @Table(name = "contract")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Contract {

    /** Contract id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** Contract code */
    @Column(length = 70)
    private String reference;

}

