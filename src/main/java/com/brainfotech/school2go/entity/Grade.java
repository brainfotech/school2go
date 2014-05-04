package com.brainfotech.school2go.entity;

import javax.persistence.*;

/**
 * Created by thameema on 4/28/14.
 */

@Entity
@Table(name = "school_grades")
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

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
