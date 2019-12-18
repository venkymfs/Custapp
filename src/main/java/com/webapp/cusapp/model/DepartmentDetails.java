package com.webapp.cusapp.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "deptdetails")
public class DepartmentDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@JsonIgnore
	private int cust_id;
	private int dept_id;
	private String dept_name;
	
	@OneToMany(targetEntity = CustomerDetails.class, mappedBy = "cust_id", orphanRemoval = false, fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<CustomerDetails> custdetails;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public Set<CustomerDetails> getCustdetails() {
		return custdetails;
	}
	public void setCustdetails(Set<CustomerDetails> custdetails) {
		this.custdetails = custdetails;
	}
	
	
	
}
