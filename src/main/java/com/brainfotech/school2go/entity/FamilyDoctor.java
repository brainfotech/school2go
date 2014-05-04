package com.brainfotech.school2go.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the family_doctors database table.
 * 
 */
@Entity
@Table(name="family_doctors")
@NamedQuery(name="FamilyDoctor.findAll", query="SELECT f FROM FamilyDoctor f")
public class FamilyDoctor extends AbstractIdEntity {
	private static final long serialVersionUID = 1L;


	private String address1;

	private String address2;

	private String city;



	private String email;

	@Column(name="family_id")
	private int familyId;

	private int fax;

	private int phone1;

	private int phone2;

	@Column(name="physician_name")
	private String physicianName;

	@Column(name="practice_type")
	private String practiceType;

	private String state;



	public FamilyDoctor() {
	}

	
	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFamilyId() {
		return this.familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public int getFax() {
		return this.fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}

	public int getPhone1() {
		return this.phone1;
	}

	public void setPhone1(int phone1) {
		this.phone1 = phone1;
	}

	public int getPhone2() {
		return this.phone2;
	}

	public void setPhone2(int phone2) {
		this.phone2 = phone2;
	}

	public String getPhysicianName() {
		return this.physicianName;
	}

	public void setPhysicianName(String physicianName) {
		this.physicianName = physicianName;
	}

	public String getPracticeType() {
		return this.practiceType;
	}

	public void setPracticeType(String practiceType) {
		this.practiceType = practiceType;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}



}