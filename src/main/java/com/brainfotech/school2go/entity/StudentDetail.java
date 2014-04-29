package com.brainfotech.school2go.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the student_details database table.
 * 
 */
@Entity
@Table(name = "student_details")
@NamedQuery(name = "StudentDetail.findAll", query = "SELECT s FROM StudentDetail s")
public class StudentDetail extends AbstractIdEntity {
	private static final long serialVersionUID = 1L;

	@Lob
	@Column(name = "drug_allergies")
	private String drugAllergies;

	@Lob
	@Column(name = "food_allergies")
	private String foodAllergies;

	@Column(name = "student_id")
	private int studentId;

	@Temporal(TemporalType.DATE)
	@Column(name = "student_since")
	private Date studentSince;

	public StudentDetail() {
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

}