package co.unicauca.digital.repository.back.domain.contractType.dto.request;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Class that defines an entity for the O/R mapping for the input of information from the ContractType table.
 */

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ContractTypeDtoCreateRequest {
    
    /*ContactType name */
    @NotNull(message = "{contractType.name.field.not.null}")
    @NotEmpty(message = "{contractType.name.field.not.empty}")
    private String name;

    /*ContactType external code */
    @NotNull(message = "{contractType.externalCode.field.not.null}")
    @NotEmpty(message = "{contractType.externalCode.field.not.empty}")
    private String externalCode;
}
