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
@Table(name = "stock")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stock.findAll", query = "SELECT s FROM Stock s"),
    @NamedQuery(name = "Stock.findById", query = "SELECT s FROM Stock s WHERE s.id = :id"),
    @NamedQuery(name = "Stock.findByCode", query = "SELECT s FROM Stock s WHERE s.code = :code"),
    @NamedQuery(name = "Stock.findByDescription", query = "SELECT s FROM Stock s WHERE s.description = :description"),
    @NamedQuery(name = "Stock.findByImagepath", query = "SELECT s FROM Stock s WHERE s.imagepath = :imagepath"),
    @NamedQuery(name = "Stock.findByName", query = "SELECT s FROM Stock s WHERE s.name = :name"),
    @NamedQuery(name = "Stock.findByPrice", query = "SELECT s FROM Stock s WHERE s.price = :price"),
    @NamedQuery(name = "Stock.findByQuantity", query = "SELECT s FROM Stock s WHERE s.quantity = :quantity"),
    @NamedQuery(name = "Stock.findByWfield1", query = "SELECT s FROM Stock s WHERE s.wfield1 = :wfield1"),
    @NamedQuery(name = "Stock.findByWfield2", query = "SELECT s FROM Stock s WHERE s.wfield2 = :wfield2"),
    @NamedQuery(name = "Stock.findByWfield3", query = "SELECT s FROM Stock s WHERE s.wfield3 = :wfield3"),
    @NamedQuery(name = "Stock.findByWfield4", query = "SELECT s FROM Stock s WHERE s.wfield4 = :wfield4")})
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "CODE")
    private String code;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 255)
    @Column(name = "IMAGEPATH")
    private String imagepath;
    @Size(max = 255)
    @Column(name = "NAME")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "QUANTITY")
    private Integer quantity;
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

    public Stock() {
    }

    public Stock(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.innate.cresterp.accounting.entities.Stock[ id=" + id + " ]";
    }
    
}
