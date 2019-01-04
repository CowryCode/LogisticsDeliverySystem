/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowrycode.entity;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author JavaEE
 */
@Entity
public class Company extends AbstractEntity{
    
    @NotNull(message = "Company name is empty")
    @Size(max = 40, message = "Company name must be less than 40 characters")
    private String companyName;
    
    @NotNull(message = "Company name is empty")
    @Size(max = 40, message = "Company name must be less than 40 characters")
    private String companyAddress;
    
   @OneToMany(mappedBy = "userCompany")
    private Collection<User> companyEmployees = new ArrayList<>();

    public Company() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

      
    
    
}
