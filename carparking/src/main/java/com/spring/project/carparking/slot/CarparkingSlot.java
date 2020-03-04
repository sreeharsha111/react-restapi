package com.spring.project.carparking.slot;


import javax.persistence.Entity;
import javax.persistence.Id;

//import com.spring.project.carparking.location.CarparkingLocation;

@Entity
public class CarparkingSlot {

	@Id
	private String Slot_no;
	private String Email;
	

	
	public CarparkingSlot() {
		super();
	}
	public CarparkingSlot(String Slot_no,String Email)
	{
		super();
		
		
		this.Slot_no=Slot_no;
		this.Email=Email;
	
	}
	public String getSlot_no() {
		return Slot_no;
	}
	public void setSlot_no(String slot_no) {
		Slot_no = slot_no;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	



	
	
	}
