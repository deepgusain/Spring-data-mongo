package com.deep.app.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.deep.app.mongo.entity.SimpleCollection;

@Repository
public interface SimpleCollectionRepository extends MongoRepository<SimpleCollection, String>, SimpleCollectionCustomRepository {
	
	SimpleCollection findByName(String name);
	
	void deleteById(long id);

}
