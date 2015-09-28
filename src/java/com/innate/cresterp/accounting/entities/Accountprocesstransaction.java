/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.innate.cresterp.accounting.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TINASHE
 */
@Entity
@Table(name = "accountprocesstransaction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accountprocesstransaction.findAll", query = "SELECT a FROM Accountprocesstransaction a"),
    @NamedQuery(name = "Accountprocesstransaction.findById", query = "SELECT a FROM Accountprocesstransaction a WHERE a.id = :id"),
    @NamedQuery(name = "Accountprocesstransaction.findByWfield1", query = "SELECT a FROM Accountprocesstransaction a WHERE a.wfield1 = :wfield1"),
    @NamedQuery(name = "Accountprocesstransaction.findByWfield2", query = "SELECT a FROM Accountprocesstransaction a WHERE a.wfield2 = :wfield2"),
    @NamedQuery(name = "Accountprocesstransaction.findByWfield3", query = "SELECT a FROM Accountprocesstransaction a WHERE a.wfield3 = :wfield3"),
    @NamedQuery(name = "Accountprocesstransaction.findByWfield4", query = "SELECT a FROM Accountprocesstransaction a WHERE a.wfield4 = :wfield4"),
    @NamedQuery(name = "Accountprocesstransaction.findByWfield5", query = "SELECT a FROM Accountprocesstransaction a WHERE a.wfield5 = :wfield5"),
    @NamedQuery(name = "Accountprocesstransaction.findByWfield6", query = "SELECT a FROM Accountprocesstransaction a WHERE a.wfield6 = :wfield6")})
public class Accountprocesstransaction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
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
    @OneToMany(mappedBy = "accountprocesstransactionId")
    private List<Accounttransactiondefinition> accounttransactiondefinitionList;
    @OneToMany(mappedBy = "transactionId")
    private List<Bookofaccounts> bookofaccountsList;
    @JoinColumn(name = "ACCOUNTPROCESSDEFINITION_ID", referencedColumnName = "ID")
    @ManyToOne
    private Accountingprocessdefinition accountprocessdefinitionId;

    public Accountprocesstransaction() {
    }

    public Accountprocesstransaction(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    public List<Accounttransactiondefinition> getAccounttransactiondefinitionList() {
        return accounttransactiondefinitionList;
    }

    public void setAccounttransactiondefinitionList(List<Accounttransactiondefinition> accounttransactiondefinitionList) {
        this.accounttransactiondefinitionList = accounttransactiondefinitionList;
    }

    @XmlTransient
    public List<Bookofaccounts> getBookofaccountsList() {
        return bookofaccountsList;
    }

    public void setBookofaccountsList(List<Bookofaccounts> bookofaccountsList) {
        this.bookofaccountsList = bookofaccountsList;
    }

    public Accountingprocessdefinition getAccountprocessdefinitionId() {
        return accountprocessdefinitionId;
    }

    public void setAccountprocessdefinitionId(Accountingprocessdefinition accountprocessdefinitionId) {
        this.accountprocessdefinitionId = accountprocessdefinitionId;
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
        if (!(object instanceof Accountprocesstransaction)) {
            return false;
        }
        Accountprocesstransaction other = (Accountprocesstransaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.innate.cresterp.accounting.entities.Accountprocesstransaction[ id=" + id + " ]";
    }
    
}
