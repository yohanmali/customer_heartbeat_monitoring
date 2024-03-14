package com.cricket.demo.models;

import lombok.Data;

@Data
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private int zipCode;
}
