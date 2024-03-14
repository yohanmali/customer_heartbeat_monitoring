package com.cricket.demo.service;

import com.cricket.demo.models.Name;
import com.cricket.demo.models.Nba;
import com.cricket.demo.request.NbaServiceRequest;
import com.cricket.demo.response.NbaServiceResponse;
import org.springframework.stereotype.Service;

@Service
public class NbaService {
    public NbaServiceResponse NbaInfo (NbaServiceRequest nbaServiceRequest){
        NbaServiceResponse result = new NbaServiceResponse();
        Nba nba = new Nba();
        Name name = new Name();

        if (nbaServiceRequest.getNbaName().getFirstName().equals("Lebron") &&
        nbaServiceRequest.getNbaName().getLastName().equals("James")) {
            nba.setAge(39);
            nba.setHeight(6.6);
            nba.setWeight("250 lb");
            nba.setTeam("Lakers");
            nba.setRings("4");
            name.setFirstName("Lebron");
            name.setLastName("James");
            nba.setName(name);
            result.setNba(nba);
        }
        return result;
    }
}
