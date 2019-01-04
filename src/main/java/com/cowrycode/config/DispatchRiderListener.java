/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowrycode.config;

import com.cowrycode.entity.DispatchRider;
import java.util.UUID;
import javax.persistence.PrePersist;

/**
 *
 * @author JavaEE
 */
public class DispatchRiderListener {
    
    @PrePersist
    public void setDispatcherCode(DispatchRider dispatchRider){
        final String uuid =  UUID.randomUUID().toString().replace("-", "");
        dispatchRider.setDispatcherCode(uuid);
    }
}
