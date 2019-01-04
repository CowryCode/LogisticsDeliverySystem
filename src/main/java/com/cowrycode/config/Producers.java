/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowrycode.config;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author JavaEE
 */
public class Producers {
    @Produces
    @PersistenceContext        
    EntityManager entityManager;    
}
