package com.brainfotech.school2go.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Created by thameema on 4/27/14.
 */

@javax.persistence.Entity
@Table(name = "SCHOOL")
@XmlRootElement(name = "school")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@NamedQueries({

})

public class School extends AbstractIdEntity{

    @XmlEnum
    @XmlType(namespace = "school")
    public enum Status {ACTIVE, INACTIVE};

    @NotNull
    @Column(name = "NAME")
    private String name;

    @NotNull
    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CITY")
    private String city;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "EMAIL")
    private String email;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private Status status;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
