/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codelabs.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author puzansakya
 */
@Entity
@Table(name = "tbl_parents")
@NamedQueries({
    @NamedQuery(name = "Parent.findAll", query = "SELECT p FROM Parent p")})
public class Parent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "parent_id")
    private Integer parentId;
    @Column(name = "father_name")
    private String fatherName;
    @Column(name = "mother_name")
    private String motherName;
    @Basic(optional = false)
    @Column(name = "guardian_name")
    private String guardianName;
    @Column(name = "father_contact_no")
    private String fatherContactNo;
    @Column(name = "mother_contact_no")
    private String motherContactNo;
    @Basic(optional = false)
    @Column(name = "guardian_contact_no")
    private String guardianContactNo;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parentId")
    private List<Student> studentList;

    public Parent() {
    }

    public Parent(Integer parentId) {
        this.parentId = parentId;
    }

    public Parent(Integer parentId, String guardianName, String guardianContactNo, String address) {
        this.parentId = parentId;
        this.guardianName = guardianName;
        this.guardianContactNo = guardianContactNo;
        this.address = address;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getFatherContactNo() {
        return fatherContactNo;
    }

    public void setFatherContactNo(String fatherContactNo) {
        this.fatherContactNo = fatherContactNo;
    }

    public String getMotherContactNo() {
        return motherContactNo;
    }

    public void setMotherContactNo(String motherContactNo) {
        this.motherContactNo = motherContactNo;
    }

    public String getGuardianContactNo() {
        return guardianContactNo;
    }

    public void setGuardianContactNo(String guardianContactNo) {
        this.guardianContactNo = guardianContactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parentId != null ? parentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parent)) {
            return false;
        }
        Parent other = (Parent) object;
        if ((this.parentId == null && other.parentId != null) || (this.parentId != null && !this.parentId.equals(other.parentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.codelabs.entity.Parent[ parentId=" + parentId + " ]";
    }
    
}
