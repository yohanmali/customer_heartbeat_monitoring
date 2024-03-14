package com.cricket.demo.service;

import com.cricket.demo.models.Address;
import com.cricket.demo.models.Appliers;
import com.cricket.demo.models.Name;
import com.cricket.demo.request.AppliersServiceRequest;
import com.cricket.demo.response.AppliersServiceResponse;
import org.springframework.stereotype.Service;

@Service
public class AppliersService {

    public AppliersServiceResponse applierInfo(AppliersServiceRequest appliersServiceRequest) {

        AppliersServiceResponse result = new AppliersServiceResponse();
        Name responseName = new Name();
        Appliers responseAppliers = new Appliers();
        Address responseAddress = new Address();

        if (appliersServiceRequest.getCreditScore() >= 700) {

            responseAppliers.setMessage("YOU ARE PRE APPROVED");
            responseName.setFirstName(appliersServiceRequest.getApplierName().getFirstName());
            responseName.setLastName(appliersServiceRequest.getApplierName().getLastName());
            if(appliersServiceRequest.getApplierAddress()!= null && appliersServiceRequest.getApplierAddress().getAddressLine1()!= null)
            responseAddress.setAddressLine1(appliersServiceRequest.getApplierAddress().getAddressLine1());
            if(appliersServiceRequest.getApplierAddress()!= null && appliersServiceRequest.getApplierAddress().getAddressLine2()!= null)
                responseAddress.setAddressLine2(appliersServiceRequest.getApplierAddress().getAddressLine2());
            if(appliersServiceRequest.getApplierAddress()!= null && appliersServiceRequest.getApplierAddress().getCity()!= null)
                responseAddress.setCity(appliersServiceRequest.getApplierAddress().getCity());
            if(appliersServiceRequest.getApplierAddress()!= null && appliersServiceRequest.getApplierAddress().getState()!= null)
                responseAddress.setState(appliersServiceRequest.getApplierAddress().getState());
            if(appliersServiceRequest.getApplierAddress()!= null && appliersServiceRequest.getApplierAddress().getZipCode()!= 0)
                responseAddress.setZipCode(appliersServiceRequest.getApplierAddress().getZipCode());
           // appliers.setAge(appliersServiceRequest.get);
         //   appliers.setEmail(appliersServiceRequest);
           // responseAppliers.setMarried();
            responseAppliers.setEmployer("OneVeloce");
            responseAppliers.setAnnualIncome(120000);
            responseAppliers.setCreditScore("EXCELLENT");
            responseAppliers.setName(responseName);
            responseAppliers.setAddress(responseAddress);
            result.setAppliers(responseAppliers);

        }else{
            responseAppliers.setMessage("YOU ARE NOT QUALIFIED  " + appliersServiceRequest.getApplierName().getFirstName() + " "+ appliersServiceRequest.getApplierName().getLastName());
            responseAppliers.setCreditScore("BAD CREDIT");
            result.setAppliers(responseAppliers);

        }
//       return result;

        return result;


  }
}
