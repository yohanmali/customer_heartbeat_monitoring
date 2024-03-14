package com.cricket.demo.service;

import com.cricket.demo.models.Name;
import com.cricket.demo.models.States;
import com.cricket.demo.request.StatesServiceRequest;
import com.cricket.demo.response.StatesServiceResponse;
import org.springframework.stereotype.Service;

@Service
public class StatesService {

    public StatesServiceResponse statesInfo(StatesServiceRequest statesServiceRequest) {

        StatesServiceResponse result = new StatesServiceResponse();
        States states = new States();
        Name name = new Name();


        if (statesServiceRequest.getGovernorName().getFirstName()!=null &&
                statesServiceRequest.getGovernorName().getFirstName().equals("Gavin")) {
            states.setCapital("Sacramento");
            states.setPopulation("39.24 million (2021)");
            states.setUnemploymentRate("4.1% (Nov 2022)");
            states.setParty("Democratic Party");
            name.setFirstName("Gavin");
            name.setLastName("Newsom");
            states.setGovernor(name);
            result.setStates(states);
        }else{
            name.setFirstName("Governor not found");
            states.setGovernor(name);
            result.setStates(states);
        }
        return result;

    }
}
