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
@Table(name = "systemuser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Systemuser.findAll", query = "SELECT s FROM Systemuser s"),
    @NamedQuery(name = "Systemuser.findById", query = "SELECT s FROM Systemuser s WHERE s.id = :id"),
    @NamedQuery(name = "Systemuser.findByCellphonenumber", query = "SELECT s FROM Systemuser s WHERE s.cellphonenumber = :cellphonenumber"),
    @NamedQuery(name = "Systemuser.findByEmail", query = "SELECT s FROM Systemuser s WHERE s.email = :email"),
    @NamedQuery(name = "Systemuser.findByFullname", query = "SELECT s FROM Systemuser s WHERE s.fullname = :fullname"),
    @NamedQuery(name = "Systemuser.findByPassword", query = "SELECT s FROM Systemuser s WHERE s.password = :password"),
    @NamedQuery(name = "Systemuser.findByUsername", query = "SELECT s FROM Systemuser s WHERE s.username = :username")})
public class Systemuser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "CELLPHONENUMBER")
    private String cellphonenumber;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 255)
    @Column(name = "FULLNAME")
    private String fullname;
    @Size(max = 255)
    @Column(name = "PASSWORD")
    private String password;
    @Size(max = 255)
    @Column(name = "USERNAME")
    private String username;
    @OneToMany(mappedBy = "userId")
    private List<Bookofaccounts> bookofaccountsList;

    public Systemuser() {
    }

    public Systemuser(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCellphonenumber() {
        return cellphonenumber;
    }

    public void setCellphonenumber(String cellphonenumber) {
        this.cellphonenumber = cellphonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @XmlTransient
    public List<Bookofaccounts> getBookofaccountsList() {
        return bookofaccountsList;
    }

    public void setBookofaccountsList(List<Bookofaccounts> bookofaccountsList) {
        this.bookofaccountsList = bookofaccountsList;
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
        if (!(object instanceof Systemuser)) {
            return false;
        }
        Systemuser other = (Systemuser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.innate.cresterp.accounting.entities.Systemuser[ id=" + id + " ]";
    }
    
}
