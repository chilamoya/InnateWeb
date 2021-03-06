/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.innate.cresterp.accounting.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TINASHE
 */
@Entity
@Table(name = "smsmessage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Smsmessage.findAll", query = "SELECT s FROM Smsmessage s"),
    @NamedQuery(name = "Smsmessage.findById", query = "SELECT s FROM Smsmessage s WHERE s.id = :id"),
    @NamedQuery(name = "Smsmessage.findByDwfield1", query = "SELECT s FROM Smsmessage s WHERE s.dwfield1 = :dwfield1"),
    @NamedQuery(name = "Smsmessage.findByDwfield2", query = "SELECT s FROM Smsmessage s WHERE s.dwfield2 = :dwfield2"),
    @NamedQuery(name = "Smsmessage.findByDwfield3", query = "SELECT s FROM Smsmessage s WHERE s.dwfield3 = :dwfield3"),
    @NamedQuery(name = "Smsmessage.findByMessage", query = "SELECT s FROM Smsmessage s WHERE s.message = :message"),
    @NamedQuery(name = "Smsmessage.findByRecipient", query = "SELECT s FROM Smsmessage s WHERE s.recipient = :recipient"),
    @NamedQuery(name = "Smsmessage.findByStatus", query = "SELECT s FROM Smsmessage s WHERE s.status = :status"),
    @NamedQuery(name = "Smsmessage.findByWfield1", query = "SELECT s FROM Smsmessage s WHERE s.wfield1 = :wfield1"),
    @NamedQuery(name = "Smsmessage.findByWfield2", query = "SELECT s FROM Smsmessage s WHERE s.wfield2 = :wfield2"),
    @NamedQuery(name = "Smsmessage.findByWfield3", query = "SELECT s FROM Smsmessage s WHERE s.wfield3 = :wfield3")})
public class Smsmessage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DWFIELD1")
    private Double dwfield1;
    @Column(name = "DWFIELD2")
    private Double dwfield2;
    @Column(name = "DWFIELD3")
    private Double dwfield3;
    @Size(max = 255)
    @Column(name = "MESSAGE")
    private String message;
    @Size(max = 255)
    @Column(name = "RECIPIENT")
    private String recipient;
    @Size(max = 255)
    @Column(name = "STATUS")
    private String status;
    @Size(max = 255)
    @Column(name = "WFIELD1")
    private String wfield1;
    @Size(max = 255)
    @Column(name = "WFIELD2")
    private String wfield2;
    @Size(max = 255)
    @Column(name = "WFIELD3")
    private String wfield3;

    public Smsmessage() {
    }

    public Smsmessage(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getDwfield1() {
        return dwfield1;
    }

    public void setDwfield1(Double dwfield1) {
        this.dwfield1 = dwfield1;
    }

    public Double getDwfield2() {
        return dwfield2;
    }

    public void setDwfield2(Double dwfield2) {
        this.dwfield2 = dwfield2;
    }

    public Double getDwfield3() {
        return dwfield3;
    }

    public void setDwfield3(Double dwfield3) {
        this.dwfield3 = dwfield3;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Smsmessage)) {
            return false;
        }
        Smsmessage other = (Smsmessage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.innate.cresterp.accounting.entities.Smsmessage[ id=" + id + " ]";
    }
    
}
