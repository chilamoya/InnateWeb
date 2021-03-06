/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.innate.cresterp.accounting;

import com.innate.cresterp.accounting.entities.Bookofaccounts;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author TINASHE
 */
@Stateless
public class BookofaccountsFacade extends AbstractFacade<Bookofaccounts> {
    @PersistenceContext(unitName = "InnatePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookofaccountsFacade() {
        super(Bookofaccounts.class);
    }
    
}
