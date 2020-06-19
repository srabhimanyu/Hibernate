package com.dbi.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="TraineeDetails")
@Table(name="trainee_details")
public class TraineeDetails {
	
	private int tid;
	private long mob;
	private String email;
	
	
	  @OneToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "trainee_id")
	  private Trainee t;
   
	  public Trainee getT() {
		return t;
	}

	public void setT(Trainee t) {
		this.t = t;
	}

	@Id
    @GeneratedValue
	public int getTid() {
		return tid;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
