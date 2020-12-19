package com.nat.sportsmanagementfinal.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the staff database table.
 * 
 */
@Entity
@NamedQuery(name="Staff.findAll", query="SELECT s FROM Staff s")
public class Staff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staffid;

	private String firstname;

	private String lastname;

	private int ssnit;

	public Staff() {
	}

	public Staff(String firstname, String lastname, int ssnit) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.ssnit = ssnit;
	}

	public int getStaffid() {
		return this.staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSsnit() {
		return this.ssnit;
	}

	public void setSsnit(int ssnit) {
		this.ssnit = ssnit;
	}

}