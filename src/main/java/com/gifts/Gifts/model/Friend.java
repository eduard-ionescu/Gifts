/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gifts.Gifts.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */
public class Friend {
    private String name;
    private String phoneNumber;   
    private List<Gift> gifts;

    @Override
    public String toString() {
        if (phoneNumber == null) return name;
        return name + ", phoneNumber=" + phoneNumber;
    }

    public Friend(String name) {
        this.name = name;
        gifts = new ArrayList<>();
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
}
