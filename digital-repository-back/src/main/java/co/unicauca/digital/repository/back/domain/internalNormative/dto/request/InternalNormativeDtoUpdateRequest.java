package co.unicauca.digital.repository.back.domain.internalNormative.dto.request;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * Class that defines an entity for the O/R mapping for the input of information from the INTERNAL NORMATIVE table.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class InternalNormativeDtoUpdateRequest {

    /** InternalNormative id */
    @NotNull(message = "{name.field.not.null}")
    @NotEmpty(message = "{name.field.not.empty}")
    private Integer id;

    /** InternalNormative name */
    @NotNull(message = "{name.field.not.null}")
    @NotEmpty(message = "{name.field.not.empty}")
    private String name;

    /** InternalNormative isInForce */
    @NotNull(message = "{isInForce.field.not.null}")
    @NotEmpty(message = "{isInForce.field.not.empty}")
    private Boolean isInForce;

    /** InternalNormative initialTime */
    @NotNull(message = "{initialTime.field.not.null}")
    @NotEmpty(message = "{initialTime.field.not.empty}")
    private LocalDateTime initialTime;

    /** InternalNormative finalTime */
    private LocalDateTime finalTime;

}
