package com.webapp.cusapp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="custdetails")
public class CustomerDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	private int cust_id; 
	private String cust_name; 
	private String cust_addr;
	private String dob; 
	private String company_name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cust_id" , insertable = false, updatable = false )
	@Fetch(FetchMode.JOIN)
	private DepartmentDetails deptdetails;

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_addr() {
		return cust_addr;
	}

	public void setCust_addr(String cust_addr) {
		this.cust_addr = cust_addr;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public DepartmentDetails getDeptdetails() {
		return deptdetails;
	}

	public void setDeptdetails(DepartmentDetails deptdetails) {
		this.deptdetails = deptdetails;
	}
    
 }
