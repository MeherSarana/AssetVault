package com.jfs.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfs.training.bean.AssetItemBean;
import com.jfs.training.dao.AssetItemDAOWrapper;
import com.jfs.training.entity.AssetItemEntity;

@Service
public class AssetItemServiceImpl implements AssetItemService {

    @Autowired
    private AssetItemDAOWrapper assetItemDAOWrapper;

    // ToDo Item 1.4
    // Invoke DAO wrapper method to save asset details

    @Override
    public AssetItemBean addAssetItem(AssetItemBean assetItemBean) {

        // Write your code here
    	AssetItemEntity entity = new AssetItemEntity();
    	BeanUtils.copyProperties(assetItemBean, entity);
    	AssetItemEntity savedEntity = assetItemDAOWrapper.addAssetItem(entity);
    	AssetItemBean bean = new AssetItemBean();
    	BeanUtils.copyProperties(savedEntity, bean);
    	
    	return bean;
    }

    // ToDo Item 1.5
    // Invoke DAO wrapper method to fetch asset records

    @Override
    public List getAllAssetItems() {

        // Write your code here
    	List<AssetItemEntity> entityList = assetItemDAOWrapper.getAllAssetItems();
    	List<AssetItemBean> beanList = new ArrayList<>();
    	
    	for (AssetItemEntity entity : entityList) {
    		AssetItemBean bean = new AssetItemBean();
    		BeanUtils.copyProperties(entity, bean);
    		beanList.add(bean);
    	}
        return beanList;
    }
}