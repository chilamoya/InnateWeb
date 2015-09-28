/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.innate.cresterp.accounting;

import com.innate.cresterp.accounting.entities.Systemuser;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author TINASHE
 */
@Stateless
public class SystemuserFacade extends AbstractFacade<Systemuser> {
    @PersistenceContext(unitName = "InnatePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SystemuserFacade() {
        super(Systemuser.class);
    }
    
}
