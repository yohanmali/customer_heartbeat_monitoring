package com.cricket.demo.controllers;

import com.cricket.demo.request.AppliersServiceRequest;
import com.cricket.demo.response.AppliersServiceResponse;
import com.cricket.demo.service.AppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/")
public class AppliersController {

    @Autowired
    private AppliersService appliersService;

    @PostMapping("applier/info")
    public AppliersServiceResponse apllierInfo(@RequestBody AppliersServiceRequest appliersServiceRequest){
        //AppliersServiceResponse appliersServiceResponse = appliersService.applierInfo(appliersServiceRequest);

        return appliersService.applierInfo(appliersServiceRequest);
    }
}
