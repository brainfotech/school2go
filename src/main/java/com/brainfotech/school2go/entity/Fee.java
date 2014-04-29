package com.brainfotech.school2go.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the fees database table.
 * 
 */
@Entity
@Table(name="fees")
@NamedQuery(name="Fee.findAll", query="SELECT f FROM Fee f")
public class Fee extends AbstractIdEntity  {
	private static final long serialVersionUID = 1L;


	private int active;

	

	private String description;

	@Column(name="display_name")
	private String displayName;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	private BigDecimal fee;

	private String name;

	private String recurring;

	@Column(name="recurring_type")
	private String recurringType;

	@Column(name="school_id")
	private int schoolId;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	
	public Fee() {
	}



	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	

	

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getFee() {
		return this.fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRecurring() {
		return this.recurring;
	}

	public void setRecurring(String recurring) {
		this.recurring = recurring;
	}

	public String getRecurringType() {
		return this.recurringType;
	}

	public void setRecurringType(String recurringType) {
		this.recurringType = recurringType;
	}

	public int getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	
}