package co.unicauca.digital.repository.back.domain.modalityContractType.dto.request;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Class that defines an entity for the O/R mapping for the input of information from the MODALITY CONTRACT TYPE table.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ModalityContractTypeDtoCreateRequest {

    /** ModalityContractType ModalityId */
    @NotNull(message = "{ModalityContractType.modalityId.field.not.null}")
    @NotEmpty(message = "{ModalityContractType.modalityId.field.not.empty}")
    private Integer modalityId;

    /** ModalityContractType ContractTypeId */
    @NotNull(message = "{ModalityContractType.contractTypeId.field.not.null}")
    @NotEmpty(message = "{ModalityContractType.contractTypeId.field.not.empty}")
    private Integer contractTypeId;

    /** ModalityContractType InternalNormativeId */
    @NotNull(message = "{ModalityContractType.internalNormativeId.field.not.null}")
    @NotEmpty(message = "{ModalityContractType.internalNormativeId.field.not.empty}")
    private Integer internalNormativeId;
}
