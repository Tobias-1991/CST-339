package com.smg.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.smg.data.entity.ProductsEntity;

public interface ProductsRepository extends MongoRepository<ProductsEntity, String> {
	ProductsEntity getProductById(String id);
}
