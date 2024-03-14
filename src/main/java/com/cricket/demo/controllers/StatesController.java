package com.cricket.demo.controllers;

import com.cricket.demo.request.StatesServiceRequest;
import com.cricket.demo.response.StatesServiceResponse;
import com.cricket.demo.service.StatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/")
public class StatesController {

    @Autowired
    private StatesService statesService;

    @PostMapping(value = "state/info",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public StatesServiceResponse statesInfo(@RequestBody StatesServiceRequest statesServiceRequest) {

        StatesServiceResponse statesServiceResponse = statesService.statesInfo(statesServiceRequest);
        return statesServiceResponse;
    }
}
