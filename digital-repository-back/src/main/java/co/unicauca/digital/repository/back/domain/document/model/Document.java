package co.unicauca.digital.repository.back.domain.document.model;

import co.unicauca.digital.repository.back.domain.collection.model.Collection;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="document")
public class Document {
    @Id
    private Integer id;
    @Column(length = 250)
    private String name;
    private String description;
    private Integer ordering;
    private Integer url;
    private Integer consecutive;
    private boolean isException;
    @Column(length = 250)
    private String type;
    private LocalDateTime expeditionDate;
    @Column(length = 250)
    private String createUser;
    private LocalDateTime createTime;
    @Column(length = 250)
    private String updateUser;
    private LocalDateTime updateTime;

    @ManyToOne
    @JoinColumn(name = "id")
    private Collection collection;

    public Document() {
    }

    public Document(Integer id, String name, String description, Integer ordering, Integer url, Integer consecutive, boolean isException, String type, LocalDateTime expeditionDate, String createUser, LocalDateTime createTime, String updateUser, LocalDateTime updateTime, Collection collection) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ordering = ordering;
        this.url = url;
        this.consecutive = consecutive;
        this.isException = isException;
        this.type = type;
        this.expeditionDate = expeditionDate;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
        this.collection = collection;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public Integer getUrl() {
        return url;
    }

    public void setUrl(Integer url) {
        this.url = url;
    }

    public Integer getConsecutive() {
        return consecutive;
    }

    public void setConsecutive(Integer consecutive) {
        this.consecutive = consecutive;
    }

    public boolean isException() {
        return isException;
    }

    public void setException(boolean exception) {
        isException = exception;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getExpeditionDate() {
        return expeditionDate;
    }

    public void setExpeditionDate(LocalDateTime expeditionDate) {
        this.expeditionDate = expeditionDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }
}
