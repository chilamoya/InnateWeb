/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.innate.cresterp.accounting.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "bookofaccounts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bookofaccounts.findAll", query = "SELECT b FROM Bookofaccounts b"),
    @NamedQuery(name = "Bookofaccounts.findById", query = "SELECT b FROM Bookofaccounts b WHERE b.id = :id"),
    @NamedQuery(name = "Bookofaccounts.findByBalance", query = "SELECT b FROM Bookofaccounts b WHERE b.balance = :balance"),
    @NamedQuery(name = "Bookofaccounts.findByCreatedate", query = "SELECT b FROM Bookofaccounts b WHERE b.createdate = :createdate"),
    @NamedQuery(name = "Bookofaccounts.findByCurrentbalance", query = "SELECT b FROM Bookofaccounts b WHERE b.currentbalance = :currentbalance"),
    @NamedQuery(name = "Bookofaccounts.findByDescription", query = "SELECT b FROM Bookofaccounts b WHERE b.description = :description"),
    @NamedQuery(name = "Bookofaccounts.findByErpmodule", query = "SELECT b FROM Bookofaccounts b WHERE b.erpmodule = :erpmodule"),
    @NamedQuery(name = "Bookofaccounts.findByRawdata", query = "SELECT b FROM Bookofaccounts b WHERE b.rawdata = :rawdata"),
    @NamedQuery(name = "Bookofaccounts.findByTransactiondate", query = "SELECT b FROM Bookofaccounts b WHERE b.transactiondate = :transactiondate")})
public class Bookofaccounts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Column(name = "BALANCE")
    private BigInteger balance;
    @Column(name = "CREATEDATE")
    @Temporal(TemporalType.DATE)
    private Date createdate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CURRENTBALANCE")
    private Double currentbalance;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 255)
    @Column(name = "ERPMODULE")
    private String erpmodule;
    @Size(max = 1000)
    @Column(name = "RAWDATA")
    private String rawdata;
    @Column(name = "TRANSACTIONDATE")
    @Temporal(TemporalType.DATE)
    private Date transactiondate;
    @JoinColumn(name = "CREDITEDACCOUNT_ID", referencedColumnName = "ID")
    @ManyToOne
    private Account creditedaccountId;
    @JoinColumn(name = "DEBITEDACCOUNT_ID", referencedColumnName = "ID")
    @ManyToOne
    private Account debitedaccountId;
    @JoinColumn(name = "TRANSACTION_ID", referencedColumnName = "ID")
    @ManyToOne
    private Accountprocesstransaction transactionId;
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    @ManyToOne
    private Systemuser userId;

    public Bookofaccounts() {
    }

    public Bookofaccounts(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigInteger getBalance() {
        return balance;
    }

    public void setBalance(BigInteger balance) {
        this.balance = balance;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Double getCurrentbalance() {
        return currentbalance;
    }

    public void setCurrentbalance(Double currentbalance) {
        this.currentbalance = currentbalance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getErpmodule() {
        return erpmodule;
    }

    public void setErpmodule(String erpmodule) {
        this.erpmodule = erpmodule;
    }

    public String getRawdata() {
        return rawdata;
    }

    public void setRawdata(String rawdata) {
        this.rawdata = rawdata;
    }

    public Date getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(Date transactiondate) {
        this.transactiondate = transactiondate;
    }

    public Account getCreditedaccountId() {
        return creditedaccountId;
    }

    public void setCreditedaccountId(Account creditedaccountId) {
        this.creditedaccountId = creditedaccountId;
    }

    public Account getDebitedaccountId() {
        return debitedaccountId;
    }

    public void setDebitedaccountId(Account debitedaccountId) {
        this.debitedaccountId = debitedaccountId;
    }

    public Accountprocesstransaction getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Accountprocesstransaction transactionId) {
        this.transactionId = transactionId;
    }

    public Systemuser getUserId() {
        return userId;
    }

    public void setUserId(Systemuser userId) {
        this.userId = userId;
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
        if (!(object instanceof Bookofaccounts)) {
            return false;
        }
        Bookofaccounts other = (Bookofaccounts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.innate.cresterp.accounting.entities.Bookofaccounts[ id=" + id + " ]";
    }
    
}
