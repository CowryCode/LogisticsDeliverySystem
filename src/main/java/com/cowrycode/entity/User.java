/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowrycode.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 *
 * @author JavaEE
 */
@Entity
public class User extends AbstractEntity{
    
    @NotNull(message = "Name must not be empty")
    @Max(35)
    private String name;
    
    @Email(message = "It must be of the format emailaddress@domain.com")
    @NotNull(message = "Email must be set")
    private String email;
    
    @NotNull(message = "Phone Number is required")
    @Pattern(message = "Acceptable format +23412345678", regexp = "^[+][0-9]+")
    private String phoneNumber;
    
    @NotNull(message = "Must password")
    private String password;
    
    @NotNull(message = "PHome Address is required")
    private String userAddress;
    
    @ManyToOne()
    private Company userCompany;

    public User() {
    }

    public Company getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(Company userCompany) {
        this.userCompany = userCompany;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
    
    
        
    
}
