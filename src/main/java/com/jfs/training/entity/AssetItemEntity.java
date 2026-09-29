package com.jfs.training.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asset_items")
public class AssetItemEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "asset_code", nullable = false, unique = true)
    private String assetCode;

    @Column(name = "asset_name", nullable = false)
    private String assetName;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "assigned_to")
    private String assignedTo;

    @Column(name = "status", nullable = false)
    private String status;

    public AssetItemEntity() {
        super();
    }

    public AssetItemEntity(Long id, String assetCode, String assetName,
            String category, String assignedTo, String status) {
        super();
        this.id = id;
        this.assetCode = assetCode;
        this.assetName = assetName;
        this.category = category;
        this.assignedTo = assignedTo;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AssetItemEntity [id=" + id + ", assetCode=" + assetCode
                + ", assetName=" + assetName + ", category=" + category
                + ", assignedTo=" + assignedTo + ", status=" + status + "]";
    }
}