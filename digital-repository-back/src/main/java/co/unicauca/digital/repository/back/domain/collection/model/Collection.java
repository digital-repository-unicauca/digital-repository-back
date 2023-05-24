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
    @Column(length = 250)
    private String createUser;
    private LocalDateTime createTime;
    @Column(length = 250)
    private String updateUser;
    private LocalDateTime updateTime;

    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL)
    private ArrayList<Document> documents;

    @ManyToOne(mappeBy = "collections",cascade = CascadeType.ALL)
    private ContractualDocument contractualDocument;

    @ManyToOne(mappeBy = "collections",cascade = CascadeType.ALL)
    private Contract contract;

    public Collection() {
    }

    public Collection(Integer id, Integer parentId, boolean isLocalRequerid, String createUser, LocalDateTime createTime, String updateUser, LocalDateTime updateTime, ArrayList<Document> documents, ContractualDocument contractualDocument, Contract contract) {
        this.id = id;
        this.parentId = parentId;
        this.isLocalRequerid = isLocalRequerid;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
        this.documents = documents;
        this.contractualDocument = contractualDocument;
        this.contract = contract;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public boolean isLocalRequerid() {
        return isLocalRequerid;
    }

    public void setLocalRequerid(boolean localRequerid) {
        isLocalRequerid = localRequerid;
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

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    public ContractualDocument getContractualDocument() {
        return contractualDocument;
    }

    public void setContractualDocument(ContractualDocument contractualDocument) {
        this.contractualDocument = contractualDocument;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
