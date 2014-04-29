package com.brainfotech.school2go.entity;

/**
 * Created by thameema on 4/28/14.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.ToStringBuilder;

@Entity
@Table (name = "Family")
@NamedQueries({
})
public class Family extends AbstractIdEntity {

    @Column(name="balance")
    private Double balance;

    @XmlEnum
    @XmlType(namespace = "family")
    public enum Status {ACTIVE, INACTIVE};

    @Column(name="status")
    private Status status;

    @Column(name="father_firstname")
    private String fatherFirstName;

    @Column(name="father_lastname")
    private String fatherLastName;

    @Column(name="mother_firstname")
    private String motherFirstName;

    @Column(name="mother_lastname")
    private String motherLastName;

    @Column(name="emergency_name1")
    private String emergencyName1;

    @Column(name="emergency_name2")
    private String emergencyName2;

    @Column(name="emergency_phone1")
    private String emergencyPhone1;

    @Column(name="emergency_phone2")
    private String emergencyPhone2;

    @Column(name="insurance_name")
    private String insuranceName;

    @Column(name="insudrance_id")
    private String insuranceId;

    @Column(name="insurance_group")
    private String insuranceGroupId;

    @Column(name="insurance_address")
    private String insuranceAddress;

    @Column(name="dental_insurance_name")
    private String dentalInsuranceName;

    @Column(name="dental_insurance_id")
    private String dentalInsuranceId;

    @Column(name="dental_insurance_group")
    private String dentalInsuranceGroupId;

    @Column(name="dental_insurance_address")
    private String dentalInsuranceAddress;

    @Column(name="vision_insurance_name")
    private String visionInsuranceName;

    @Column(name="vision_insurance_id")
    private String visionInsuranceId;

    @Column(name="vision_insurance_group")
    private String visionInsuranceGroupId;

    @Column(name="vision_insurance_address")
    private String visionInsuranceAddress;

    @ManyToOne
    @JoinColumn(name = "SCHOOL_ID", nullable = false, updatable = false)
    private School school;


    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public void setMotherLastName(String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public String getEmergencyName1() {
        return emergencyName1;
    }

    public void setEmergencyName1(String emergencyName1) {
        this.emergencyName1 = emergencyName1;
    }

    public String getEmergencyName2() {
        return emergencyName2;
    }

    public void setEmergencyName2(String emergencyName2) {
        this.emergencyName2 = emergencyName2;
    }

    public String getEmergencyPhone1() {
        return emergencyPhone1;
    }

    public void setEmergencyPhone1(String emergencyPhone1) {
        this.emergencyPhone1 = emergencyPhone1;
    }

    public String getEmergencyPhone2() {
        return emergencyPhone2;
    }

    public void setEmergencyPhone2(String emergencyPhone2) {
        this.emergencyPhone2 = emergencyPhone2;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getInsuranceGroupId() {
        return insuranceGroupId;
    }

    public void setInsuranceGroupId(String insuranceGroupId) {
        this.insuranceGroupId = insuranceGroupId;
    }

    public String getInsuranceAddress() {
        return insuranceAddress;
    }

    public void setInsuranceAddress(String insuranceAddress) {
        this.insuranceAddress = insuranceAddress;
    }

    public String getDentalInsuranceName() {
        return dentalInsuranceName;
    }

    public void setDentalInsuranceName(String dentalInsuranceName) {
        this.dentalInsuranceName = dentalInsuranceName;
    }

    public String getDentalInsuranceId() {
        return dentalInsuranceId;
    }

    public void setDentalInsuranceId(String dentalInsuranceId) {
        this.dentalInsuranceId = dentalInsuranceId;
    }

    public String getDentalInsuranceGroupId() {
        return dentalInsuranceGroupId;
    }

    public void setDentalInsuranceGroupId(String dentalInsuranceGroupId) {
        this.dentalInsuranceGroupId = dentalInsuranceGroupId;
    }

    public String getDentalInsuranceAddress() {
        return dentalInsuranceAddress;
    }

    public void setDentalInsuranceAddress(String dentalInsuranceAddress) {
        this.dentalInsuranceAddress = dentalInsuranceAddress;
    }

    public String getVisionInsuranceName() {
        return visionInsuranceName;
    }

    public void setVisionInsuranceName(String visionInsuranceName) {
        this.visionInsuranceName = visionInsuranceName;
    }

    public String getVisionInsuranceId() {
        return visionInsuranceId;
    }

    public void setVisionInsuranceId(String visionInsuranceId) {
        this.visionInsuranceId = visionInsuranceId;
    }

    public String getVisionInsuranceGroupId() {
        return visionInsuranceGroupId;
    }

    public void setVisionInsuranceGroupId(String visionInsuranceGroupId) {
        this.visionInsuranceGroupId = visionInsuranceGroupId;
    }

    public String getVisionInsuranceAddress() {
        return visionInsuranceAddress;
    }

    public void setVisionInsuranceAddress(String visionInsuranceAddress) {
        this.visionInsuranceAddress = visionInsuranceAddress;
    }

    public com.brainfotech.school2go.entity.School getSchool() {
        return school;
    }

    public void setSchool(com.brainfotech.school2go.entity.School school) {
        this.school = school;
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

