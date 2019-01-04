/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowrycode.service;

import com.cowrycode.entity.CurrierItem;
import com.cowrycode.entity.DeliveryStatus;
import com.cowrycode.entity.LocationObject;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author JavaEE
 */
@DataSourceDefinition(
        name = "java:app/deliverysystem/deliverysystem",
        className = "org.apache.derby.jdbc.ClientDriver",
        url = "jdbc:derby://localhost:1527/deliverysystem",
        user = "username",
        password = "password"
)

@Stateless
public class PersistenceService {
    @Inject
    EntityManager entityManager;
    
    
    public void saveCurrierItem(CurrierItem currierItem){
//        LocationObject lo = new LocationObject();
//        lo.setAddress("This is another Test");
//        lo.setLatitude(3.46779);
//        lo.setLongitude(6.33234090);
//        CurrierItem ci = new CurrierItem();
//        ci.setDeliveryStatus(DeliveryStatus.DELIVERED);
//        ci.setLocationObject(lo);
        entityManager.persist(currierItem);
    }
    
    
    
}
