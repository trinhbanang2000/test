package com.laptrinhjava.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "new")
public class New {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "created_by", nullable = true, length = 255)
    private String createdBy;
    @Basic
    @Column(name = "created_date", nullable = true)
    private Timestamp createdDate;
    @Basic
    @Column(name = "modified_by", nullable = true, length = 255)
    private String modifiedBy;
    @Basic
    @Column(name = "modified_date", nullable = true)
    private Timestamp modifiedDate;
    @Basic
    @Column(name = "content", nullable = true, length = 255)
    private String content;
    @Basic
    @Column(name = "shortdescription", nullable = true, length = 255)
    private String shortdescription;
    @Basic
    @Column(name = "thumbail", nullable = true, length = 255)
    private String thumbail;
    @Basic
    @Column(name = "title", nullable = true, length = 255)
    private String title;
    @Basic
    @Column(name = "category_id", nullable = true)
    private Long categoryId;
    @ManyToOne
    @JoinColumn(name = "category_id")

    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

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
}
