package com.example.xml_req_res.Model;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;

@Data
public class DocDetails {
    @JacksonXmlProperty(localName = "DocType")
    private String docType;

    @JacksonXmlProperty(localName = "DigiLockerId")
    private String digiLockerId;

    @JacksonXmlProperty(localName = "UID")
    private String aadhaarNumber;

    @JacksonXmlProperty(localName = "FullName")
    private String fullName;

    @JacksonXmlProperty(localName = "DOB")
    private String dateOfBirth;

    @JacksonXmlProperty(localName = "Photo")
    private String photo;

    @JacksonXmlProperty(localName = "UDF1")
    private String userDefinedField1;

    @JacksonXmlProperty(localName = "UDF2")
    private String userDefinedField2;

    // Add getters and setters for all fields
}


