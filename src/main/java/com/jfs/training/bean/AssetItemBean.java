package com.jfs.training.bean;

public class AssetItemBean {

    private Long id;
    private String assetCode;
    private String assetName;
    private String category;
    private String assignedTo;
    private String status;

    public AssetItemBean() {
    }

    public AssetItemBean(Long id, String assetCode, String assetName,
                         String category, String assignedTo, String status) {
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
}