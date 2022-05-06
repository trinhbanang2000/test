package com.laptrinhjava.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "new")
public class New {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "created_by")
    private String createdBy;
    @Basic
    @Column(name = "created_date")
    private Timestamp createdDate;
    @Basic
    @Column(name = "modified_by")
    private String modifiedBy;
    @Basic
    @Column(name = "modified_date")
    private Timestamp modifiedDate;
    @Basic
    @Column(name = "content")
    private String content;
    @Basic
    @Column(name = "shortdescription")
    private String shortdescription;
    @Basic
    @Column(name = "thumbail")
    private String thumbail;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "category_id")
    private Long categoryId;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private Category category;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getShortdescription() {
        return shortdescription;
    }

    public void setShortdescription(String shortdescription) {
        this.shortdescription = shortdescription;
    }

    public String getThumbail() {
        return thumbail;
    }

    public void setThumbail(String thumbail) {
        this.thumbail = thumbail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "New{" +
                "id=" + id +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", content='" + content + '\'' +
                ", shortdescription='" + shortdescription + '\'' +
                ", thumbail='" + thumbail + '\'' +
                ", title='" + title + '\'' +
                ", categoryId=" + categoryId +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        New aNew = (New) o;
        return id == aNew.id && Objects.equals(createdBy, aNew.createdBy) && Objects.equals(createdDate, aNew.createdDate) && Objects.equals(modifiedBy, aNew.modifiedBy) && Objects.equals(modifiedDate, aNew.modifiedDate) && Objects.equals(content, aNew.content) && Objects.equals(shortdescription, aNew.shortdescription) && Objects.equals(thumbail, aNew.thumbail) && Objects.equals(title, aNew.title) && Objects.equals(categoryId, aNew.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdBy, createdDate, modifiedBy, modifiedDate, content, shortdescription, thumbail, title, categoryId);
    }
}
