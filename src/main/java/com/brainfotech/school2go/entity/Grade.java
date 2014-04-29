package com.brainfotech.school2go.entity;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by thameema on 4/28/14.
 */

@javax.persistence.Entity
@Table (name = "STUDENT")
@XmlRootElement(name = "school_grades")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@NamedQueries({

})
public class Grade extends AbstractIdEntity {

    @ManyToOne
    @JoinColumn(name = "SCHOOL_ID", nullable = false, updatable = false)
    private School school;

    @Column(name="grade_name")
    private String name;

    @Column(name="description")
    private String description;



}
