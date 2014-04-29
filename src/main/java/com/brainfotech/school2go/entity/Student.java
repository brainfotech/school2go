package com.brainfotech.school2go.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student extends AbstractIdEntity {
	private static final long serialVersionUID = 1L;

	
	@Column(name="academic_level")
	private String academicLevel;

	private int dentist;

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String email;

	@Column(name="family_id")
	private int familyId;

	@Column(name="first_name")
	private String firstName;

	private String gender;

	private int grade;

	@Column(name="last_name")
	private String lastName;

	private int phone;

	private int physician;

	private String returning;

	@Column(name="school_id")
	private int schoolId;

	@Column(name="school_name")
	private String schoolName;

	private String status;

	
	public Student() {
	}

	
	public String getAcademicLevel() {
		return this.academicLevel;
	}

	public void setAcademicLevel(String academicLevel) {
		this.academicLevel = academicLevel;
	}

	public int getDentist() {
		return this.dentist;
	}

	public void setDentist(int dentist) {
		this.dentist = dentist;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getGrade() {
		return this.grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getPhysician() {
		return this.physician;
	}

	public void setPhysician(int physician) {
		this.physician = physician;
	}

	public String getReturning() {
		return this.returning;
	}

	public void setReturning(String returning) {
		this.returning = returning;
	}

	public int getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}