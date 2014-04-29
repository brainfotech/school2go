package com.brainfotech.school2go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the family database table.
 * 
 */
@Entity
@NamedQuery(name="Family.findAll", query="SELECT f FROM Family f")
public class Family implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private BigDecimal balance;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="created_by")
	private String createdBy;

	@Lob
	@Column(name="dental_insurance_address")
	private String dentalInsuranceAddress;

	@Column(name="dental_insurance_group")
	private String dentalInsuranceGroup;

	@Column(name="dental_insurance_id")
	private String dentalInsuranceId;

	@Column(name="dental_insurance_name")
	private String dentalInsuranceName;

	@Column(name="emergency_name1")
	private String emergencyName1;

	@Column(name="emergency_name2")
	private String emergencyName2;

	@Column(name="emergency_phone1")
	private String emergencyPhone1;

	@Column(name="emergency_phone2")
	private String emergencyPhone2;

	@Column(name="father_firstname")
	private String fatherFirstname;

	@Column(name="father_lastname")
	private String fatherLastname;

	@Lob
	@Column(name="insurance_address")
	private String insuranceAddress;

	@Column(name="insurance_group")
	private String insuranceGroup;

	@Column(name="insurance_id")
	private String insuranceId;

	@Column(name="insurance_name")
	private String insuranceName;

	@Column(name="mother_firstname")
	private String motherFirstname;

	@Column(name="mother_lastname")
	private String motherLastname;

	@Column(name="school_id")
	private int schoolId;

	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="updated_by")
	private String updatedBy;

	@Lob
	@Column(name="vision_insurance_address")
	private String visionInsuranceAddress;

	@Column(name="vision_insurance_group")
	private String visionInsuranceGroup;

	@Column(name="vision_insurance_id")
	private String visionInsuranceId;

	@Column(name="vision_insurance_name")
	private String visionInsuranceName;

	public Family() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDentalInsuranceAddress() {
		return this.dentalInsuranceAddress;
	}

	public void setDentalInsuranceAddress(String dentalInsuranceAddress) {
		this.dentalInsuranceAddress = dentalInsuranceAddress;
	}

	public String getDentalInsuranceGroup() {
		return this.dentalInsuranceGroup;
	}

	public void setDentalInsuranceGroup(String dentalInsuranceGroup) {
		this.dentalInsuranceGroup = dentalInsuranceGroup;
	}

	public String getDentalInsuranceId() {
		return this.dentalInsuranceId;
	}

	public void setDentalInsuranceId(String dentalInsuranceId) {
		this.dentalInsuranceId = dentalInsuranceId;
	}

	public String getDentalInsuranceName() {
		return this.dentalInsuranceName;
	}

	public void setDentalInsuranceName(String dentalInsuranceName) {
		this.dentalInsuranceName = dentalInsuranceName;
	}

	public String getEmergencyName1() {
		return this.emergencyName1;
	}

	public void setEmergencyName1(String emergencyName1) {
		this.emergencyName1 = emergencyName1;
	}

	public String getEmergencyName2() {
		return this.emergencyName2;
	}

	public void setEmergencyName2(String emergencyName2) {
		this.emergencyName2 = emergencyName2;
	}

	public String getEmergencyPhone1() {
		return this.emergencyPhone1;
	}

	public void setEmergencyPhone1(String emergencyPhone1) {
		this.emergencyPhone1 = emergencyPhone1;
	}

	public String getEmergencyPhone2() {
		return this.emergencyPhone2;
	}

	public void setEmergencyPhone2(String emergencyPhone2) {
		this.emergencyPhone2 = emergencyPhone2;
	}

	public String getFatherFirstname() {
		return this.fatherFirstname;
	}

	public void setFatherFirstname(String fatherFirstname) {
		this.fatherFirstname = fatherFirstname;
	}

	public String getFatherLastname() {
		return this.fatherLastname;
	}

	public void setFatherLastname(String fatherLastname) {
		this.fatherLastname = fatherLastname;
	}

	public String getInsuranceAddress() {
		return this.insuranceAddress;
	}

	public void setInsuranceAddress(String insuranceAddress) {
		this.insuranceAddress = insuranceAddress;
	}

	public String getInsuranceGroup() {
		return this.insuranceGroup;
	}

	public void setInsuranceGroup(String insuranceGroup) {
		this.insuranceGroup = insuranceGroup;
	}

	public String getInsuranceId() {
		return this.insuranceId;
	}

	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getInsuranceName() {
		return this.insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getMotherFirstname() {
		return this.motherFirstname;
	}

	public void setMotherFirstname(String motherFirstname) {
		this.motherFirstname = motherFirstname;
	}

	public String getMotherLastname() {
		return this.motherLastname;
	}

	public void setMotherLastname(String motherLastname) {
		this.motherLastname = motherLastname;
	}

	public int getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getVisionInsuranceAddress() {
		return this.visionInsuranceAddress;
	}

	public void setVisionInsuranceAddress(String visionInsuranceAddress) {
		this.visionInsuranceAddress = visionInsuranceAddress;
	}

	public String getVisionInsuranceGroup() {
		return this.visionInsuranceGroup;
	}

	public void setVisionInsuranceGroup(String visionInsuranceGroup) {
		this.visionInsuranceGroup = visionInsuranceGroup;
	}

	public String getVisionInsuranceId() {
		return this.visionInsuranceId;
	}

	public void setVisionInsuranceId(String visionInsuranceId) {
		this.visionInsuranceId = visionInsuranceId;
	}

	public String getVisionInsuranceName() {
		return this.visionInsuranceName;
	}

	public void setVisionInsuranceName(String visionInsuranceName) {
		this.visionInsuranceName = visionInsuranceName;
	}

}