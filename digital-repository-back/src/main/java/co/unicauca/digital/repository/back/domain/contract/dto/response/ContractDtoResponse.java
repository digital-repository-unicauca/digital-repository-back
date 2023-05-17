package co.unicauca.digital.repository.back.domain.contract.dto.response;
import lombok.*;


/**
 * Class that defines an entity for the O/R mapping for the output of information from the CONTRACT table.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ContractDtoResponse {
    /** Contract id */
    private Integer id;

    /** Contract code */
    private String reference;
}
