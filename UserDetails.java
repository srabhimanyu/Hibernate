package com.dbi.entity;



import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
	
	
	private int userid;
	private String  username;

	
	@Embedded
	private Address address;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getUserid() {
		return userid;
	}
	
	
	
	public void setUserid(int userid) {
		this.userid = userid;
	}




	
	

	
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	
	
	
	
	public String getUsername() {
		return username;
	}
	
	
	public void setUsername(String username) {
		this.username = username;
	}
}
