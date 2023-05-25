package co.unicauca.digital.repository.back.domain.document.model;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="document")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /** Document id */
    private Integer id;
    @Column(length = 250)
    /** Document name */
    private String name;
    /** Document description */
    private String description;
    /** Document Ordering */
    private Integer ordering;
    /** Document url */
    private Integer url;
    /** Document Consecutive */
    private Integer consecutive;
    /** Document isException */
    private boolean isException;
    @Column(length = 250)
    /** Document type */
    private String type;
    /** Document expeditionDate */
    private LocalDateTime expeditionDate;
    @Column(length = 250)
    /** Document create user */
    private String createUser;
    /** Document create time */
    private LocalDateTime createTime;
    @Column(length = 250)
    /** Document update user */
    private String updateUser;
    /** Document update time */
    private LocalDateTime updateTime;

    /**
    @ManyToOne
    @JoinColumn(name = "collectionId")
    private Collection collection;
    */

}