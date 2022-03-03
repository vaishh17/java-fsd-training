package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Customer")
public class Customer {
	
	@Id
	private int Custid;
	private int Custname;
	private int Custcity;
	public int getCustid() {
		return Custid;
	}
	public void setCustid(int custid) {
		Custid = custid;
	}
	public int getCustname() {
		return Custname;
	}
	public void setCustname(int custname) {
		Custname = custname;
	}
	public int getCustcity() {
		return Custcity;
	}
	public void setCustcity(int custcity) {
		Custcity = custcity;
	}
	
	

}
