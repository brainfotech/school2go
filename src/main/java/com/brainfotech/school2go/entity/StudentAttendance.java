package com.brainfotech.school2go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the student_attendance database table.
 * 
 */
@Entity
@Table(name="student_attendance")
@NamedQuery(name="StudentAttendance.findAll", query="SELECT s FROM StudentAttendance s")
public class StudentAttendance extends AbstractIdEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="attendance_id")
	private int attendanceId;

	@Temporal(TemporalType.DATE)
	private Date date;

	private String period;

	@Column(name="student_id")
	private int studentId;

	public StudentAttendance() {
	}

	public int getAttendanceId() {
		return this.attendanceId;
	}

	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}


	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}




}