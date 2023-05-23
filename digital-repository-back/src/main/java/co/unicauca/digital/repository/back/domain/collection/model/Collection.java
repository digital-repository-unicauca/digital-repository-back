package co.unicauca.digital.repository.back.domain.collection.model;

import co.unicauca.digital.repository.back.domain.document.model.Document;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Entity
@Table(name="collection")
public class Collection {
    @Id
    private Integer id;
    private Integer parentId;
    private boolean isLocalRequerid;
    private String createUser;
    private LocalDateTime createTime;
    private String updateUser;
    private LocalDateTime updateTime;

    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL)
    private ArrayList<Document> documents;
}
