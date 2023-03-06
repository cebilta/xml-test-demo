package com.example.xml_req_res;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.xml_req_res.Model.DocDetails;
import com.example.xml_req_res.Model.Employee;
import com.example.xml_req_res.Model.PullURIRequest;

@RestController
public class HomeController {

    @PostMapping(value = "/", consumes=MediaType.APPLICATION_XML_VALUE,
    produces = MediaType.APPLICATION_XML_VALUE)
    public Employee LoadHomePage(@RequestBody Employee employee){
        System.out.println(employee);
        return employee;
    }

    @PostMapping(value = "/auth", consumes=MediaType.APPLICATION_XML_VALUE)
    public void getHeaderValue(@RequestHeader(value="x-digilocker-hmac", required=true) String headervalue){
        System.out.println(headervalue);
    }

    @PostMapping(value = "/pull-uri-request", consumes = MediaType.APPLICATION_XML_VALUE)
    public void handlePullURIRequest(@RequestBody PullURIRequest pullURIRequest) {
        System.out.println("Version: " + pullURIRequest.getVersion());
        System.out.println("Timestamp: " + pullURIRequest.getTimestamp());
        System.out.println("Transaction ID: " + pullURIRequest.getTransactionId());
        System.out.println("Organization ID: " + pullURIRequest.getOrganizationId());
        System.out.println("Format: " + pullURIRequest.getFormat());
        
        DocDetails docDetails = pullURIRequest.getDocDetails();
        System.out.println("Document Type: " + docDetails.getDocType());
        System.out.println("DigiLocker ID: " + docDetails.getDigiLockerId());
        System.out.println("Aadhaar Number: " + docDetails.getAadhaarNumber());
        System.out.println("Full Name: " + docDetails.getFullName());
        System.out.println("Date of Birth: " + docDetails.getDateOfBirth());
        System.out.println("Photo: " + docDetails.getPhoto());
        System.out.println("User Defined Field 1: " + docDetails.getUserDefinedField1());
        System.out.println("User Defined Field 2: " + docDetails.getUserDefinedField2());
    }
}




