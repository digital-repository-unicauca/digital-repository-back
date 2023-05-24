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
    private String reference;

    /** Contract date of signature  */
    @PastOrPresent
    private LocalDateTime signingDate;

    /** Contract initial date */
    @PastOrPresent
    private LocalDateTime initialDate;

    /** Contract final date */
    private LocalDateTime finalDate;

    @Enumerated(EnumType.STRING)
    private ContractStatusEnum status;

    /** Contract subject */
    @Column(length = 250)
    private String subject;

}
