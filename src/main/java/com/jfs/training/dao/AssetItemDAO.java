package com.jfs.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.jfs.training.bean.AssetItemBean;
import com.jfs.training.entity.AssetItemEntity;

@Repository
public interface AssetItemDAO extends JpaRepository<AssetItemEntity, Long>{

    // ToDo Item 1.1
    // Define a JPA repository to provide built-in CRUD operations

}
