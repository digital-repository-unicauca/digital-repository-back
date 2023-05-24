package co.unicauca.digital.repository.back.domain.modalityContractType.dto.response;

import lombok.*;

/**
 * Class that defines an entity for the O/R mapping for the input of information from the MODALITYCONTRACTTYPE table.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ModalityContractTypeDtoResponse {
    /** ModalityContractType id */
    private Integer id;

    /** ModalityContractType ModalityId */
    private Modality modalityId;

    /** ModalityContractType ContractTypeId */
    private ContractType contractTypeId;

    /** ModalityContractType InternalNormativeId */
    private InternalNormative internalNormativeId;
}
