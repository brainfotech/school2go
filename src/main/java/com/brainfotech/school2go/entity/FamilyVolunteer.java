package com.brainfotech.school2go.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the family_volunteer database table.
 * 
 */
@Entity
@Table(name="family_volunteer")
@NamedQuery(name="FamilyVolunteer.findAll", query="SELECT f FROM FamilyVolunteer f")
public class FamilyVolunteer extends AbstractIdEntity  {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="completed_date")
	private Date completedDate;

	@Column(name="completed_hours")
	private int completedHours;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="family_id")
	private int familyId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="signed_date")
	private Date signedDate;

	@Column(name="signed_hours")
	private int signedHours;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="volunteer_type_id")
	private int volunteerTypeId;

	public FamilyVolunteer() {
	}

	public Date getCompletedDate() {
		return this.completedDate;
	}

	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}

	public int getCompletedHours() {
		return this.completedHours;
	}

	public void setCompletedHours(int completedHours) {
		this.completedHours = completedHours;
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

	public int getFamilyId() {
		return this.familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public Date getSignedDate() {
		return this.signedDate;
	}

	public void setSignedDate(Date signedDate) {
		this.signedDate = signedDate;
	}

	public int getSignedHours() {
		return this.signedHours;
	}

	public void setSignedHours(int signedHours) {
		this.signedHours = signedHours;
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

	public int getVolunteerTypeId() {
		return this.volunteerTypeId;
	}

	public void setVolunteerTypeId(int volunteerTypeId) {
		this.volunteerTypeId = volunteerTypeId;
	}

}