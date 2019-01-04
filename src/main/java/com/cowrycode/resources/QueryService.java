/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowrycode.resources;

import com.cowrycode.entity.CurrierItem;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author JavaEE
 */
@Stateless
public class QueryService {
    
    @Inject
    EntityManager entityManager;
    
    public List<CurrierItem> getItems(){
        return entityManager.createNamedQuery(CurrierItem.GET_ALL_ITEMS,CurrierItem.class).getResultList();
    }
    
    public CurrierItem findItemByID(Long  id){
        return entityManager.find(CurrierItem.class, id);
    }
    
}
