package co.unicauca.digital.repository.back.domain.document.model;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Document {
    /** Document id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
<<<<<<< HEAD
=======

>>>>>>> 5446ec193d838bad7784b73022d791f518a67406
    /** Document name */
    @Column(length = 250)
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
<<<<<<< HEAD
=======

>>>>>>> 5446ec193d838bad7784b73022d791f518a67406
    /** Document type */
    @Column(length = 250)
    private String type;

    /** Document expeditionDate */
    private LocalDateTime expeditionDate;
<<<<<<< HEAD
=======

>>>>>>> 5446ec193d838bad7784b73022d791f518a67406
    /** Document create user */
    @Column(length = 250)
    private String createUser;

    /** Document create time */
    private LocalDateTime createTime;
<<<<<<< HEAD
=======

>>>>>>> 5446ec193d838bad7784b73022d791f518a67406
    /** Document update user */
    @Column(length = 250)
    private String updateUser;

    /** Document update time */
    private LocalDateTime updateTime;
<<<<<<< HEAD



    /*
    @ManyToOne
    @JoinColumn(name = "collectionId")
    private Collection collection;
     */

=======
//
//    @ManyToOne
//    @JoinColumn(name = "collectionId")
//    private Collection collection;
>>>>>>> 5446ec193d838bad7784b73022d791f518a67406

}