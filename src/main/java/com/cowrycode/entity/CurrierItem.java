/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowrycode.entity;

import com.cowrycode.config.AbstractEntityListener;
import java.time.LocalDateTime;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author JavaEE
 */
@Entity
@EntityListeners(AbstractEntityListener.class)
@NamedQueries( {
@NamedQuery(name = CurrierItem.GET_ALL_ITEMS, query = "select c from CurrierItem c"),
@NamedQuery(name = CurrierItem.GET_ITEM_BY_ID, query = "select c from CurrierItem c where c.id = :id")
})
public class CurrierItem  extends AbstractEntity{
    
    public static final String GET_ALL_ITEMS = "CurrierItem.getALLCurrierItems";
    public static final String GET_ITEM_BY_ID = "CurrierItem.getCurrierItemByID";
    
    
    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus;
    
    @NotNull(message = "Delivery Status Must be stated")
    @Embedded
    private LocationObject pickupLocaton;
    
    @Enumerated(EnumType.STRING)
    @NotNull(message = "Delivery Mode must not be empty")
    private DeliveryMode deliveryMode;
    
    @OneToOne
    private DispatchRider dispatchRider;
    
    @OneToOne
    private User sender;
    
    @OneToOne
    private User reciever;
    
    private LocalDateTime deliveredOn;

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReciever() {
        return reciever;
    }

    public void setReciever(User reciever) {
        this.reciever = reciever;
    }

    public LocalDateTime getDeliveredOn() {
        return deliveredOn;
    }

    public void setDeliveredOn(LocalDateTime deliveredOn) {
        this.deliveredOn = deliveredOn;
    }
    
    

    public DeliveryMode getDeliveryMode() {
        return deliveryMode;
    }

    public void setDeliveryMode(DeliveryMode deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    public DispatchRider getDispatchRider() {
        return dispatchRider;
    }

    public void setDispatchRider(DispatchRider dispatchRider) {
        this.dispatchRider = dispatchRider;
    }

    
    
    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public LocationObject getPickupLocaton() {
        return pickupLocaton;
    }

    public void setPickupLocaton(LocationObject pickupLocaton) {
        this.pickupLocaton = pickupLocaton;
    }
    
    
}
