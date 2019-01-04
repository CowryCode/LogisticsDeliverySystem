/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowrycode.entity;

import com.cowrycode.config.DispatchRiderListener;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

/**
 *
 * @author JavaEE
 */
@Entity
@EntityListeners(DispatchRiderListener.class)
public class DispatchRider extends AbstractEntity {
    
    // Automatically fill this with a Listener
    protected String dispatcherCode;
    
    @OneToOne   
    private User riderDtail;    
    
    @OneToOne
    private Company riderCompany;

    public String getDispatcherCode() {
        return dispatcherCode;
    }

    public void setDispatcherCode(String dispatcherCode) {
        this.dispatcherCode = dispatcherCode;
    }

    public User getRiderDtail() {
        return riderDtail;
    }

    public void setRiderDtail(User riderDtail) {
        this.riderDtail = riderDtail;
    }

    public Company getRiderCompany() {
        return riderCompany;
    }

    public void setRiderCompany(Company riderCompany) {
        this.riderCompany = riderCompany;
    }
    
    
        
}
