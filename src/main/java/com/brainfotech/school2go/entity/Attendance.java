package com.brainfotech.school2go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the attendance_codes database table.
 * 
 */
@Entity
@Table(name="attendance_codes")
@NamedQuery(name="AttendanceCode.findAll", query="SELECT a FROM Attendance a")
public class Attendance extends AbstractIdEntity {
	private static final long serialVersionUID = 1L;

	@Column(name="attendance_code")
	private String attendanceCode;

	private String description;

    @ManyToOne
    @JoinColumn(name = "SCHOOL_ID", nullable = false, updatable = false)
	private School school;

	public Attendance() {
	}

	public String getAttendanceCode() {
		return this.attendanceCode;
	}

	public void setAttendanceCode(String attendanceCode) {
		this.attendanceCode = attendanceCode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}