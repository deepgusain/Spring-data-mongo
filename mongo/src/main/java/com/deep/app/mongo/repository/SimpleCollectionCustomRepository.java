package com.deep.app.mongo.repository;

import org.springframework.stereotype.Repository;

import com.deep.app.mongo.entity.SimpleCollection;


@Repository
public interface SimpleCollectionCustomRepository {
	
	public SimpleCollection fetchCustomerInfo() ;

}
