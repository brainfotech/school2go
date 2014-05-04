package com.brainfotech.school2go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the student_fees database table.
 * 
 */
@Entity
@Table(name="student_fees")
@NamedQuery(name="StudentFee.findAll", query="SELECT s FROM StudentFee s")
public class StudentFee extends AbstractIdEntity {
	private static final long serialVersionUID = 1L;


	@Column(name="due_year")
	private int dueYear;

	@Column(name="family_id")
	private int familyId;

	@Column(name="fee_id")
	private int feeId;

	@Column(name="student_id")
	private int studentId;


	public StudentFee() {
	}


	public int getDueYear() {
		return this.dueYear;
	}

	public void setDueYear(int dueYear) {
		this.dueYear = dueYear;
	}

	public int getFamilyId() {
		return this.familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public int getFeeId() {
		return this.feeId;
	}

	public void setFeeId(int feeId) {
		this.feeId = feeId;
	}

	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



}