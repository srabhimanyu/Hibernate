package com.dbi.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Trainee")
@Table(name="trainee")
public class Trainee {

	private int tid;
	private String fname;
	private String lname;
	private TraineeDetails td;
	
	@Id
	@GeneratedValue
	public int getTid() {
		return tid;
	}
	
	@OneToOne(mappedBy = "trainee", cascade = CascadeType.ALL,fetch = FetchType.LAZY, optional = false)	
	public TraineeDetails getTd() {
		return td;
	}

	public void setTd(TraineeDetails td) {
		this.td = td;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}
