package com.deep.app.mongo.entity;

public class Address {
	
	public Address(){
		
	}
	
public Address(int houseNo,String landMark,String city,long pincode, String areaName,String streetdesc){
		this.areaName=areaName;
		this.city=city;
		this.houseNo=houseNo;
		this.landMark=landMark;
		this.pincode=pincode;
		this.streetdesc=streetdesc;
	}
	private int houseNo;
	private String landMark;
	private String city;
	private long pincode;
	private String areaName;
	private String streetdesc;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getStreetdesc() {
		return streetdesc;
	}
	public void setStreetdesc(String streetdesc) {
		this.streetdesc = streetdesc;
	}

}
