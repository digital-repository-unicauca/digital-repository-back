package co.unicauca.digital.repository.back.domain.contract.dto.response;

import lombok.*;

import java.time.LocalDateTime;

/**
 * Class that defines an entity for the O/R mapping for the input of information from the CONTRACT table.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ContractDtoFindResponse {

    /** Contract id */
    private Integer id;

    /** Contract code */
    private String reference;

    /** Contract initial date */
    private LocalDateTime initialDate;

    /** Contract final date */
    private LocalDateTime finalDate;

    /** Contract vendor */
    private String vendor;
}
