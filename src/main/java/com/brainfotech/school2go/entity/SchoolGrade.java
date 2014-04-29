package com.brainfotech.school2go.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the school_grades database table.
 * 
 */
@Entity
@Table(name = "school_grades")
@NamedQuery(name = "SchoolGrade.findAll", query = "SELECT s FROM SchoolGrade s")
public class SchoolGrade extends AbstractIdEntity {
	private static final long serialVersionUID = 1L;

	private String description;

	@Column(name = "grade_name")
	private String gradeName;

	@Column(name = "school_id")
	private int schoolId;

	public SchoolGrade() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGradeName() {
		return this.gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public int getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

}