package com.spring.project.carparking.slot;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

//import com.spring.project.carparking.location.CarparkingLocation;

@Entity
public class CarparkingSlot {

	@Id
	private String slot;
	private String userid;
	

	
	public CarparkingSlot() {
		super();
	}
	public CarparkingSlot(String slot,String userid)
	{
		super();
		
		
		this.slot=slot;
		this.userid=userid;
	
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}



	
	
	}
