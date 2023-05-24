package co.unicauca.digital.repository.back.domain.contractType.dto.request;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 * Class that defines an entity for the O/R mapping for the input of information from the ContractType table.
 */

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ContractTypeDtoUpdateRequest {

    /** ContractType id */
    @NotNull(message = "{contractType.ID.field.not.null}")
    @Positive(message = "{contractType.ID.field.positive}")
    private Integer id;

    /** ContractType name */
    @NotNull(message = "{contractType.name.field.not.null}")
    @NotEmpty(message = "{contractType.name.field.not.empty}")
    private String name;

   /*ContractType external code */
   @NotNull(message = "{contractType.externalCode.field.not.null}")
   @NotEmpty(message = "{contractType.externalCode.field.not.empty}")
   private String externalCode;
}
