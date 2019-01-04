/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowrycode.config;

import com.cowrycode.entity.AbstractEntity;
import java.time.LocalDateTime;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 *
 * @author JavaEE
 */
public class AbstractEntityListener {
    
    @PrePersist
    public void setCreatedOn(AbstractEntity abstractEntity){
        abstractEntity.setCreatedOn(LocalDateTime.now());
    }
    
    @PreUpdate
    public void setUpdatedon(AbstractEntity abstractEntity){
        abstractEntity.setUpdatedOn(LocalDateTime.now());
    }
    
}
