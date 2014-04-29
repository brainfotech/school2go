package com.brainfotech.school2go.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

/**
 * Created by thameema on 4/28/14.
 */

@javax.persistence.Entity
@Table (name = "STUDENT")
@XmlRootElement(name = "student")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@NamedQueries({

})
public class Student extends AbstractIdEntity{
    @XmlEnum
    @XmlType(namespace = "student")
    public enum Status {ACTIVE, INACTIVE};

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "dob")
    private Date dob;

    @ManyToOne
    @JoinColumn(name = "FAMILY_ID", nullable = false, updatable = false)
    private Family family;

    @ManyToOne
    @JoinColumn(name = "GRADE_ID", nullable = false, updatable = false)
    private Grade grade;

    @ManyToOne
    @JoinColumn(name = "SCHOOL_ID", nullable = false, updatable = false)
    private School school;

    //private String physician;
    //private String dentist;


    private Status status;

    @Column(name = "academic_level")
    private String academicLevel;

    @Column(name = "school_name")
    private String schoolName;



    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @PrePersist
    private void prePresist() {
        if (this.status == null) {
            this.status = Status.ACTIVE;
        }
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


}
