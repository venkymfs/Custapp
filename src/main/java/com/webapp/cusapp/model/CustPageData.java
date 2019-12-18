package com.webapp.cusapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustPageData {

	@Id
	private int custid;
	private String cust_name;
	
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	@Override
	public String toString() {
		return "CustPageData [custid=" + custid + ", cust_name=" + cust_name + "]";
	}
	
	
}
