package co.unicauca.digital.repository.back.domain.internalNormative.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class InternalNormativeDtoResponse {

    /** InternalNormative id */
    private Integer id;

    /** InternalNormative name */
    private String name;

    /** InternalNormative isInForce */
    private Boolean isInForce;

    /** InternalNormative initialTime */
    private LocalDateTime initialTime;

    /** InternalNormative finalTime */
    private LocalDateTime finalTime;

}
