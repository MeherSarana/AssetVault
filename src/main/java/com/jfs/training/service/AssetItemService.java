package com.jfs.training.service;

import java.util.List;

import com.jfs.training.bean.AssetItemBean;
import com.jfs.training.entity.AssetItemEntity;

public interface AssetItemService {

    AssetItemBean addAssetItem(AssetItemBean assetItemBean);

    List<AssetItemBean> getAllAssetItems();
}