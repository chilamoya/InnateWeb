/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.innate.cresterp.accounting.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TINASHE
 */
@Entity
@Table(name = "company")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c"),
    @NamedQuery(name = "Company.findById", query = "SELECT c FROM Company c WHERE c.id = :id"),
    @NamedQuery(name = "Company.findByAddress", query = "SELECT c FROM Company c WHERE c.address = :address"),
    @NamedQuery(name = "Company.findByCode", query = "SELECT c FROM Company c WHERE c.code = :code"),
    @NamedQuery(name = "Company.findByContactemail", query = "SELECT c FROM Company c WHERE c.contactemail = :contactemail"),
    @NamedQuery(name = "Company.findByContactnumber", query = "SELECT c FROM Company c WHERE c.contactnumber = :contactnumber"),
    @NamedQuery(name = "Company.findByCreateddate", query = "SELECT c FROM Company c WHERE c.createddate = :createddate"),
    @NamedQuery(name = "Company.findByMobilenumber", query = "SELECT c FROM Company c WHERE c.mobilenumber = :mobilenumber"),
    @NamedQuery(name = "Company.findByName", query = "SELECT c FROM Company c WHERE c.name = :name"),
    @NamedQuery(name = "Company.findBySmsbalance", query = "SELECT c FROM Company c WHERE c.smsbalance = :smsbalance"),
    @NamedQuery(name = "Company.findBySmspassword", query = "SELECT c FROM Company c WHERE c.smspassword = :smspassword"),
    @NamedQuery(name = "Company.findBySmsusername", query = "SELECT c FROM Company c WHERE c.smsusername = :smsusername")})
public class Company implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "ADDRESS")
    private String address;
    @Size(max = 255)
    @Column(name = "CODE")
    private String code;
    @Size(max = 255)
    @Column(name = "CONTACTEMAIL")
    private String contactemail;
    @Size(max = 255)
    @Column(name = "CONTACTNUMBER")
    private String contactnumber;
    @Column(name = "CREATEDDATE")
    @Temporal(TemporalType.DATE)
    private Date createddate;
    @Size(max = 255)
    @Column(name = "MOBILENUMBER")
    private String mobilenumber;
    @Size(max = 500)
    @Column(name = "NAME")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SMSBALANCE")
    private Double smsbalance;
    @Size(max = 255)
    @Column(name = "SMSPASSWORD")
    private String smspassword;
    @Size(max = 255)
    @Column(name = "SMSUSERNAME")
    private String smsusername;

    public Company() {
    }

    public Company(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContactemail() {
        return contactemail;
    }

    public void setContactemail(String contactemail) {
        this.contactemail = contactemail;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSmsbalance() {
        return smsbalance;
    }

    public void setSmsbalance(Double smsbalance) {
        this.smsbalance = smsbalance;
    }

    public String getSmspassword() {
        return smspassword;
    }

    public void setSmspassword(String smspassword) {
        this.smspassword = smspassword;
    }

    public String getSmsusername() {
        return smsusername;
    }

    public void setSmsusername(String smsusername) {
        this.smsusername = smsusername;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.innate.cresterp.accounting.entities.Company[ id=" + id + " ]";
    }
    
}
