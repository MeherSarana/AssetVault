package com.jfs.training.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jfs.training.entity.AssetItemEntity;

@Repository
public class AssetItemDAOWrapper {

    @Autowired
    private AssetItemDAO assetItemDAO;

    // ToDo Item 1.2
    // Add new asset details to database
    public AssetItemEntity addAssetItem(AssetItemEntity assetItemEntity) {

        // Write your code here
        return assetItemDAO.save(assetItemEntity);
    }

    // ToDo Item 1.3
    // Fetch all asset records from database
    public List<AssetItemEntity> getAllAssetItems() {

        // Write your code here
        return assetItemDAO.findAll();
    }
}