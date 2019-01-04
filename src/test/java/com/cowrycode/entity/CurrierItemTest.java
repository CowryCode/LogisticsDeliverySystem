/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowrycode.entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JavaEE
 */
public class CurrierItemTest {
    
    public CurrierItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDeliveryStatus method, of class CurrierItem.
     */
    @Test
    public void testGetDeliveryStatus() {
        System.out.println("getDeliveryStatus");
        CurrierItem instance = new CurrierItem();
        DeliveryStatus expResult = null;
        DeliveryStatus result = instance.getDeliveryStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeliveryStatus method, of class CurrierItem.
     */
    @Test
    public void testSetDeliveryStatus() {
        System.out.println("setDeliveryStatus");
        DeliveryStatus deliveryStatus = null;
        CurrierItem instance = new CurrierItem();
        instance.setDeliveryStatus(deliveryStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocationObject method, of class CurrierItem.
     */
    @Test
    public void testGetLocationObject() {
        System.out.println("getLocationObject");
        CurrierItem instance = new CurrierItem();
        LocationObject expResult = null;
        LocationObject result = instance.getPickupLocaton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocationObject method, of class CurrierItem.
     */
    @Test
    public void testSetLocationObject() {
        System.out.println("setLocationObject");
        LocationObject locationObject = null;
        CurrierItem instance = new CurrierItem();
        instance.setPickupLocaton(locationObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
