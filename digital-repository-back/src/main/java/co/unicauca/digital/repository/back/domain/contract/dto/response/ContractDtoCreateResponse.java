package co.unicauca.digital.repository.back.domain.contract.dto.response;

import co.unicauca.digital.repository.back.domain.contract.model.ContractStatusEnum;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDateTime;

/**
 * Class that defines an entity for the O/R mapping for the input of information from the CONTRACT table.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ContractDtoCreateResponse {

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

    /** Contract create User */
    @Column(length = 250)
    private String createUser;

    /** Contract create time  */
    private LocalDateTime createTime;
}
