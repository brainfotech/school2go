package com.brainfotech.school2go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the student_details database table.
 * 
 */
@Entity
@Table(name="student_details")
@NamedQuery(name="StudentDetail.findAll", query="SELECT s FROM StudentDetail s")
public class StudentDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="created_by")
	private String createdBy;

	@Lob
	@Column(name="drug_allergies")
	private String drugAllergies;

	@Lob
	@Column(name="food_allergies")
	private String foodAllergies;

	@Column(name="student_id")
	private int studentId;

	@Temporal(TemporalType.DATE)
	@Column(name="student_since")
	private Date studentSince;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="updated_by")
	private String updatedBy;

	public StudentDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDrugAllergies() {
		return this.drugAllergies;
	}

	public void setDrugAllergies(String drugAllergies) {
		this.drugAllergies = drugAllergies;
	}

	public String getFoodAllergies() {
		return this.foodAllergies;
	}

	public void setFoodAllergies(String foodAllergies) {
		this.foodAllergies = foodAllergies;
	}

	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Date getStudentSince() {
		return this.studentSince;
	}

	public void setStudentSince(Date studentSince) {
		this.studentSince = studentSince;
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

}