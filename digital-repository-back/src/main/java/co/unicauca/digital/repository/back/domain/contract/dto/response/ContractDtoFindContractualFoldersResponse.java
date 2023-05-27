package co.unicauca.digital.repository.back.domain.contract.dto.response;

import lombok.*;

import java.time.LocalDateTime;

/**
 * Class that defines an entity for the O/R mapping for the output of information from the CONTRACT table.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ContractDtoFindContractualFoldersResponse {

    /** Contract id */
    private Integer id;

    /** Contract date of signature  */
    private LocalDateTime signingDate;

    /** Contract code */
    private String reference;

    /** Contract year of signature  */
    private int signingYear;
}
