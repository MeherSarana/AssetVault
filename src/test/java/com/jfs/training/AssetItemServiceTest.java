package com.jfs.training;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jfs.training.bean.AssetItemBean;
import com.jfs.training.service.*;

@SpringBootTest
public class AssetItemServiceTest {
	
	
	@Autowired
	private AssetItemService assetItemService;

    @Test
    public void testAddAssetItem() {

        // ToDo Test Case 1
        // Verify asset item can be added successfully
        // using service layer
    	
    	AssetItemBean assetItemBean = new AssetItemBean();
    	assetItemBean.setAssetCode("AST001");
    	assetItemBean.setAssetName("Laptop");
    	assetItemBean.setCategory("IT Equipment");
    	assetItemBean.setAssignedTo("John");
    	assetItemBean.setStatus("Available");
    	
    	AssetItemBean savedAssetItemBean = assetItemService.addAssetItem(assetItemBean);
    	Assertions.assertNotNull(savedAssetItemBean);

    }

    @Test
    public void testGetAllAssetItems() {

        // ToDo Test Case 2
        // Verify fetching asset items returns
        // a non-null list
    	
    	List<AssetItemBean> assetItems = assetItemService.getAllAssetItems();
    	Assertions.assertNotNull(assetItems);

    }

    @Test
    public void testAddAndFetchAssetItems() {

        // ToDo Test Case 3
        // Verify end-to-end add and fetch flow
    	AssetItemBean assetItemBean = new AssetItemBean();
    	assetItemBean.setAssetCode("AST002");
    	assetItemBean.setAssetName("Desktop");
    	assetItemBean.setCategory("IT Equipment");
    	assetItemBean.setAssignedTo("Alice");
    	assetItemBean.setStatus("Available");
    	
    	AssetItemBean savedAssetItem = assetItemService.addAssetItem(assetItemBean);
    	Assertions.assertNotNull(savedAssetItem);
    	
    	List<AssetItemBean> assetItems = assetItemService.getAllAssetItems();
    	Assertions.assertNotNull(assetItems);
    	Assertions.assertFalse(assetItems.isEmpty());
    	

    }
}
