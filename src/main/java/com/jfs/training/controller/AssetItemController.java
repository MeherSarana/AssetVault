package com.jfs.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jfs.training.bean.AssetItemBean;
import com.jfs.training.entity.AssetItemEntity;
import com.jfs.training.service.AssetItemService;

@RestController
@CrossOrigin(origins = "*")
public class AssetItemController {

    @Autowired
    private AssetItemService assetItemService;

    // ToDo Item 1.6
    // Accept request from React UI, validate input,
    // invoke service layer

    @PostMapping("/asset/add")
    public AssetItemBean saveAssetItem(
            @RequestBody AssetItemBean assetItemBean) {

        // Write your code here

        return assetItemService.addAssetItem(assetItemBean);
    }

    // ToDo Item 1.7
    // Return all asset records to React UI

    @GetMapping("/asset/all")
    public List<AssetItemBean> listAssetItems() {

        // Write your code here

        return assetItemService.getAllAssetItems();
    }
}