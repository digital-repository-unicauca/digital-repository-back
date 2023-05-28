package co.unicauca.digital.repository.back.domain.contract.dto.request;
import co.unicauca.digital.repository.back.domain.contract.model.ContractStatusEnum;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDateTime;

/**
 * Class that defines an entity for the O/R mapping for the input of information from the CONTRACT table.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ContractDtoCreateRequest {

    /** Contract code */
    @NotNull(message = "{contract.reference.field.not.null}")
    @NotEmpty(message = "{contract.reference.field.not.empty}")
    private String reference;

    /** Contract date of signature  */
    private LocalDateTime signingDate;

    /** Contract initial date */
    private LocalDateTime initialDate;

    /** Contract final date */
    private LocalDateTime finalDate;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "{contract.status.field.not.null}")
    private ContractStatusEnum status;

    /** Contract subject */
    @NotNull(message = "{contract.subject.field.not.null}")
    @NotEmpty(message = "{contract.subject.field.not.empty}")
    private String subject;

    /** Contract Vendor */
    @NotNull(message = "{contractualDocumentTypeRequest.vendor.field.null}")
    @Min(value = 1, message = "{contractualDocumentTypeRequest.vendor.field.error}")
    private int vendor;

    /** Contract ModalityContractType */
    @NotNull(message = "{modalityContractType.field.null}")
    @Min(value = 1, message = "{modalityContractType.field.empty}")
    private int modalityContractType;
}
