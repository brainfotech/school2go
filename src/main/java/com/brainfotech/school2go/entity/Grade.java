package com.brainfotech.school2go.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

/**
 * Created by thameema on 4/28/14.
 */

@Entity
@Table(name = "STUDENT")
@NamedQueries({

})
public class Grade extends AbstractIdEntity {

	@ManyToOne
	@JoinColumn(name = "SCHOOL_ID", nullable = false, updatable = false)
	private School school;

	@Column(name = "grade_name")
	private String name;

	@Column(name = "description")
	private String description;

}
