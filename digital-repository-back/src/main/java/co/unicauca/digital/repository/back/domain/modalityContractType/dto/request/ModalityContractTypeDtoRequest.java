package co.unicauca.digital.repository.back.domain.modalityContractType.dto.request;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Class that defines an entity for the O/R mapping for the input of information from the MODALITYCONTRACTTYPE table.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ModalityContractTypeDtoRequest {

    /** ModalityContractType ModalityId */
    @NotNull(message = "{reference.field.not.null}")
    @NotEmpty(message = "{reference.field.not.empty}")
    private Modality modalityId;

    /** ModalityContractType ContractTypeId */
    @NotNull(message = "{reference.field.not.null}")
    @NotEmpty(message = "{reference.field.not.empty}")
    private ContractType contractTypeId;

    /** ModalityContractType InternalNormativeId */
    @NotNull(message = "{reference.field.not.null}")
    @NotEmpty(message = "{reference.field.not.empty}")
    private InternalNormative internalNormativeId;

}
