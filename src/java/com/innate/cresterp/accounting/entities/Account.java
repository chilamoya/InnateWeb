/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.innate.cresterp.accounting.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TINASHE
 */
@Entity
@Table(name = "account")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a"),
    @NamedQuery(name = "Account.findById", query = "SELECT a FROM Account a WHERE a.id = :id"),
    @NamedQuery(name = "Account.findByAddress", query = "SELECT a FROM Account a WHERE a.address = :address"),
    @NamedQuery(name = "Account.findByBalance", query = "SELECT a FROM Account a WHERE a.balance = :balance"),
    @NamedQuery(name = "Account.findByCode", query = "SELECT a FROM Account a WHERE a.code = :code"),
    @NamedQuery(name = "Account.findByContacts", query = "SELECT a FROM Account a WHERE a.contacts = :contacts"),
    @NamedQuery(name = "Account.findByDatecreated", query = "SELECT a FROM Account a WHERE a.datecreated = :datecreated"),
    @NamedQuery(name = "Account.findByDescription", query = "SELECT a FROM Account a WHERE a.description = :description"),
    @NamedQuery(name = "Account.findByEmail", query = "SELECT a FROM Account a WHERE a.email = :email"),
    @NamedQuery(name = "Account.findByMobile", query = "SELECT a FROM Account a WHERE a.mobile = :mobile"),
    @NamedQuery(name = "Account.findByName", query = "SELECT a FROM Account a WHERE a.name = :name"),
    @NamedQuery(name = "Account.findBySex", query = "SELECT a FROM Account a WHERE a.sex = :sex"),
    @NamedQuery(name = "Account.findByWfield1", query = "SELECT a FROM Account a WHERE a.wfield1 = :wfield1"),
    @NamedQuery(name = "Account.findByWfield2", query = "SELECT a FROM Account a WHERE a.wfield2 = :wfield2"),
    @NamedQuery(name = "Account.findByWfield3", query = "SELECT a FROM Account a WHERE a.wfield3 = :wfield3"),
    @NamedQuery(name = "Account.findByWfield4", query = "SELECT a FROM Account a WHERE a.wfield4 = :wfield4")})
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "ADDRESS")
    private String address;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BALANCE")
    private Double balance;
    @Size(max = 255)
    @Column(name = "CODE")
    private String code;
    @Size(max = 255)
    @Column(name = "CONTACTS")
    private String contacts;
    @Column(name = "DATECREATED")
    @Temporal(TemporalType.DATE)
    private Date datecreated;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 255)
    @Column(name = "MOBILE")
    private String mobile;
    @Size(max = 255)
    @Column(name = "NAME")
    private String name;
    @Size(max = 255)
    @Column(name = "SEX")
    private String sex;
    @Size(max = 3000)
    @Column(name = "WFIELD1")
    private String wfield1;
    @Size(max = 2000)
    @Column(name = "WFIELD2")
    private String wfield2;
    @Size(max = 255)
    @Column(name = "WFIELD3")
    private String wfield3;
    @Size(max = 255)
    @Column(name = "WFIELD4")
    private String wfield4;
    @OneToMany(mappedBy = "creditaccountId")
    private List<Accounttransactiondefinition> accounttransactiondefinitionList;
    @OneToMany(mappedBy = "debitaccountId")
    private List<Accounttransactiondefinition> accounttransactiondefinitionList1;
    @OneToMany(mappedBy = "creditedaccountId")
    private List<Bookofaccounts> bookofaccountsList;
    @OneToMany(mappedBy = "debitedaccountId")
    private List<Bookofaccounts> bookofaccountsList1;

    public Account() {
    }

    public Account(Long id) {
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWfield1() {
        return wfield1;
    }

    public void setWfield1(String wfield1) {
        this.wfield1 = wfield1;
    }

    public String getWfield2() {
        return wfield2;
    }

    public void setWfield2(String wfield2) {
        this.wfield2 = wfield2;
    }

    public String getWfield3() {
        return wfield3;
    }

    public void setWfield3(String wfield3) {
        this.wfield3 = wfield3;
    }

    public String getWfield4() {
        return wfield4;
    }

    public void setWfield4(String wfield4) {
        this.wfield4 = wfield4;
    }

    @XmlTransient
    public List<Accounttransactiondefinition> getAccounttransactiondefinitionList() {
        return accounttransactiondefinitionList;
    }

    public void setAccounttransactiondefinitionList(List<Accounttransactiondefinition> accounttransactiondefinitionList) {
        this.accounttransactiondefinitionList = accounttransactiondefinitionList;
    }

    @XmlTransient
    public List<Accounttransactiondefinition> getAccounttransactiondefinitionList1() {
        return accounttransactiondefinitionList1;
    }

    public void setAccounttransactiondefinitionList1(List<Accounttransactiondefinition> accounttransactiondefinitionList1) {
        this.accounttransactiondefinitionList1 = accounttransactiondefinitionList1;
    }

    @XmlTransient
    public List<Bookofaccounts> getBookofaccountsList() {
        return bookofaccountsList;
    }

    public void setBookofaccountsList(List<Bookofaccounts> bookofaccountsList) {
        this.bookofaccountsList = bookofaccountsList;
    }

    @XmlTransient
    public List<Bookofaccounts> getBookofaccountsList1() {
        return bookofaccountsList1;
    }

    public void setBookofaccountsList1(List<Bookofaccounts> bookofaccountsList1) {
        this.bookofaccountsList1 = bookofaccountsList1;
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
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.innate.cresterp.accounting.entities.Account[ id=" + id + " ]";
    }
    
}
