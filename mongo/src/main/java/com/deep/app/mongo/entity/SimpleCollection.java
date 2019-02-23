package com.deep.app.mongo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employee_Info")
public class SimpleCollection {
	
	private double salary;
	private String name;
	private long id;
	private Address address;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "SimpleCollection [salary=" + salary + ", name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	
	
	

}
