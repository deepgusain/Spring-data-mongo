package com.deep.app.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import com.deep.app.mongo.config.MongoConfiguration;
import com.deep.app.mongo.entity.Address;
import com.deep.app.mongo.entity.SimpleCollection;
import com.deep.app.mongo.repository.SimpleCollectionRepository;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfiguration.class);
    	   
        MongoTemplate template=(MongoTemplate) ctx.getBean("mongoTemplate");
        SimpleCollectionRepository simpleCollectionRepository=(SimpleCollectionRepository)ctx.getBean("simpleCollectionRepository");
        SimpleCollection employeeInfo=simpleCollectionRepository.findByName("Test Employee");
        System.out.println("employeeInfo"+employeeInfo);
        List<SimpleCollection> list= template.findAll(SimpleCollection.class);
        
        //saveCollection(template);
        //updateCollection(template);
        //deleteCollection(simpleCollectionRepository);
        //deleteCollectionById(2,simpleCollectionRepository);
        System.out.println(list);
        
    }

	private static void deleteCollectionById(int id,SimpleCollectionRepository simpleCollectionRepository) {
		simpleCollectionRepository.deleteById(id);
	}

	private static void deleteCollection(SimpleCollectionRepository simpleCollectionRepository) {
		SimpleCollection employeeInfoDelete= new SimpleCollection();
        employeeInfoDelete.setId(1);
        simpleCollectionRepository.delete(employeeInfoDelete);		
	}

	private static void updateCollection(MongoTemplate template) {
		
		Query findQuery = new Query();
		findQuery.addCriteria(Criteria.where("_id").is(2));
		SimpleCollection employeeInfo= template.findOne(findQuery, SimpleCollection.class);
		System.out.println("employeeInfo"+employeeInfo);
        employeeInfo.setName("second Employee");
        Address address=new Address(123,"landMark","second",560100, "areaName","streetdesc");
        employeeInfo.setAddress(address);
        template.save(employeeInfo);
	}

	private static void saveCollection(MongoTemplate template) {
		SimpleCollection employeeInfo= new SimpleCollection();
        employeeInfo.setId(2);
        employeeInfo.setName("Test Employee");
        employeeInfo.setSalary(1234567.0);
        Address address=new Address(123,"landMark","city",560100, "areaName","streetdesc");
        employeeInfo.setAddress(address);
        template.save(employeeInfo);		
	}
	
	
}
