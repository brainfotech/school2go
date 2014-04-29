package com.brainfotech.school2go.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the school_grades database table.
 * 
 */
@Entity
@Table(name="school_grades")
@NamedQuery(name="SchoolGrade.findAll", query="SELECT s FROM SchoolGrade s")
public class SchoolGrade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="created_by")
	private String createdBy;

	private String description;

	@Column(name="grade_name")
	private String gradeName;

	@Column(name="school_id")
	private int schoolId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="updated_by")
	private String updatedBy;

	public SchoolGrade() {
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