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
@Table(name = "accountingprocessdefinition")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accountingprocessdefinition.findAll", query = "SELECT a FROM Accountingprocessdefinition a"),
    @NamedQuery(name = "Accountingprocessdefinition.findById", query = "SELECT a FROM Accountingprocessdefinition a WHERE a.id = :id"),
    @NamedQuery(name = "Accountingprocessdefinition.findByDatecreated", query = "SELECT a FROM Accountingprocessdefinition a WHERE a.datecreated = :datecreated"),
    @NamedQuery(name = "Accountingprocessdefinition.findByDescription", query = "SELECT a FROM Accountingprocessdefinition a WHERE a.description = :description"),
    @NamedQuery(name = "Accountingprocessdefinition.findByName", query = "SELECT a FROM Accountingprocessdefinition a WHERE a.name = :name"),
    @NamedQuery(name = "Accountingprocessdefinition.findByWfield1", query = "SELECT a FROM Accountingprocessdefinition a WHERE a.wfield1 = :wfield1"),
    @NamedQuery(name = "Accountingprocessdefinition.findByWfield2", query = "SELECT a FROM Accountingprocessdefinition a WHERE a.wfield2 = :wfield2"),
    @NamedQuery(name = "Accountingprocessdefinition.findByWfield3", query = "SELECT a FROM Accountingprocessdefinition a WHERE a.wfield3 = :wfield3"),
    @NamedQuery(name = "Accountingprocessdefinition.findByWfield4", query = "SELECT a FROM Accountingprocessdefinition a WHERE a.wfield4 = :wfield4"),
    @NamedQuery(name = "Accountingprocessdefinition.findByWfield5", query = "SELECT a FROM Accountingprocessdefinition a WHERE a.wfield5 = :wfield5"),
    @NamedQuery(name = "Accountingprocessdefinition.findByWfield6", query = "SELECT a FROM Accountingprocessdefinition a WHERE a.wfield6 = :wfield6")})
public class Accountingprocessdefinition implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Column(name = "DATECREATED")
    @Temporal(TemporalType.DATE)
    private Date datecreated;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 255)
    @Column(name = "NAME")
    private String name;
    @Size(max = 2000)
    @Column(name = "WFIELD1")
    private String wfield1;
    @Size(max = 2000)
    @Column(name = "WFIELD2")
    private String wfield2;
    @Size(max = 2000)
    @Column(name = "WFIELD3")
    private String wfield3;
    @Size(max = 2000)
    @Column(name = "WFIELD4")
    private String wfield4;
    @Size(max = 255)
    @Column(name = "WFIELD5")
    private String wfield5;
    @Size(max = 255)
    @Column(name = "WFIELD6")
    private String wfield6;
    @OneToMany(mappedBy = "accountprocessdefinitionId")
    private List<Accountprocesstransaction> accountprocesstransactionList;

    public Accountingprocessdefinition() {
    }

    public Accountingprocessdefinition(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getWfield5() {
        return wfield5;
    }

    public void setWfield5(String wfield5) {
        this.wfield5 = wfield5;
    }

    public String getWfield6() {
        return wfield6;
    }

    public void setWfield6(String wfield6) {
        this.wfield6 = wfield6;
    }

    @XmlTransient
    public List<Accountprocesstransaction> getAccountprocesstransactionList() {
        return accountprocesstransactionList;
    }

    public void setAccountprocesstransactionList(List<Accountprocesstransaction> accountprocesstransactionList) {
        this.accountprocesstransactionList = accountprocesstransactionList;
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
        if (!(object instanceof Accountingprocessdefinition)) {
            return false;
        }
        Accountingprocessdefinition other = (Accountingprocessdefinition) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.innate.cresterp.accounting.entities.Accountingprocessdefinition[ id=" + id + " ]";
    }
    
}
