package com.cricket.demo.controllers;

import com.cricket.demo.request.NbaServiceRequest;
import com.cricket.demo.response.NbaServiceResponse;
import com.cricket.demo.service.NbaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("v1/")
public class NbaController {

    @Autowired
    private NbaService nbaService;

    @PostMapping("nba/info")
    private NbaServiceResponse NbaInfo(@RequestBody NbaServiceRequest nbaServiceRequest){
        NbaServiceResponse x = nbaService.NbaInfo(nbaServiceRequest);
        return x;
    }
}
