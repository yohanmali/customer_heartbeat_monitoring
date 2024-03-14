package com.cricket.demo.request;

import com.cricket.demo.models.Address;
import com.cricket.demo.models.Name;
import lombok.Data;

@Data
public class AppliersServiceRequest {
    private Name applierName;
    private int creditScore;
    private Address applierAddress;
}
