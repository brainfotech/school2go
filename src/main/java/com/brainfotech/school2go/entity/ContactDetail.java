package com.brainfotech.school2go.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the contact_details database table.
 * 
 */
@Entity
@Table(name="contact_details")
@NamedQuery(name="ContactDetail.findAll", query="SELECT c FROM ContactDetail c")
public class ContactDetail extends AbstractIdEntity  {
	private static final long serialVersionUID = 1L;

	private String address1;

	private String address2;

	private String city;

	@Column(name="contact_name")
	private String contactName;

	
	
	private String email1;

	private String email2;

	@Column(name="family_id")
	private int familyId;

	@Column(name="home_phone")
	private int homePhone;

	@Column(name="mobile_phone1")
	private int mobilePhone1;

	@Column(name="mobile_phone2")
	private int mobilePhone2;

	private String state;



	@Column(name="work_phone")
	private int workPhone;

	public ContactDetail() {
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

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	

	
	public String getEmail1() {
		return this.email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return this.email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public int getFamilyId() {
		return this.familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public int getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(int homePhone) {
		this.homePhone = homePhone;
	}

	public int getMobilePhone1() {
		return this.mobilePhone1;
	}

	public void setMobilePhone1(int mobilePhone1) {
		this.mobilePhone1 = mobilePhone1;
	}

	public int getMobilePhone2() {
		return this.mobilePhone2;
	}

	public void setMobilePhone2(int mobilePhone2) {
		this.mobilePhone2 = mobilePhone2;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public int getWorkPhone() {
		return this.workPhone;
	}

	public void setWorkPhone(int workPhone) {
		this.workPhone = workPhone;
	}

}