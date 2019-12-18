package com.webapp.cusapp.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="custdtemb")
public class CustDtlsEmbdemo {

	@Id
	private int custid;
	private String custname;
	
	@Embedded
	private CustAddress addr;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public CustAddress getAddr() {
		return addr;
	}
	public void setAddr(CustAddress addr) {
		this.addr = addr;
	}
	
	
	
}
