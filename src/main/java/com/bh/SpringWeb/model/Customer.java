package com.bh.SpringWeb.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString @Getter @Setter
public class Customer {
    private CustomerType type;
private int years;
private int discount;
public Customer (CustomerType type, int years) {
        this.type = type;
        this.years = years;
    }
}
//-----------------------
