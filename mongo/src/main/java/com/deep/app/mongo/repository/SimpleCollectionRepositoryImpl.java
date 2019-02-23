package com.deep.app.mongo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.deep.app.mongo.entity.SimpleCollection;

public class SimpleCollectionRepositoryImpl implements SimpleCollectionCustomRepository{
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public SimpleCollection fetchCustomerInfo() {
		SimpleCollection priceStrategyMaster=null;
		Query findproductQuery = new Query();
		findproductQuery.addCriteria(Criteria.where("name").is("Test"))
						.addCriteria(Criteria.where("_id").is(1));
		List<SimpleCollection> priceStrategyList= mongoTemplate.find(findproductQuery, SimpleCollection.class);
		if(priceStrategyList!=null && !priceStrategyList.isEmpty()){
			priceStrategyMaster=priceStrategyList.get(0);
		}
		
		return priceStrategyMaster;
	}
}
