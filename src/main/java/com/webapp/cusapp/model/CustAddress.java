package com.webapp.cusapp.model;

import javax.persistence.Embeddable;

@Embeddable
public class CustAddress {

	private String housenum;
	private String streetname;
	private String mandal;
	private String dist;
	
	public String getHousenum() {
		return housenum;
	}
	public void setHousenum(String housenum) {
		this.housenum = housenum;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	
	
}
