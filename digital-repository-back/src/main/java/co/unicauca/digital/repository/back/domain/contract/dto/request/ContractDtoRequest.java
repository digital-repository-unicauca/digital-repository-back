package co.unicauca.digital.repository.back.domain.contract.dto.request;
import lombok.*;
import javax.validation.constraints.*;

/**
 * Class that defines an entity for the O/R mapping for the input of information from the CONTRACT table.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ContractDtoRequest {

    /** Contract code */
    @NotNull(message = "{reference.field.not.null}")
    @NotEmpty(message = "{reference.field.not.empty}")
    private String reference;

}
