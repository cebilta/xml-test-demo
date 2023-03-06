package com.example.xml_req_res.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

@Data

@JacksonXmlRootElement(localName = "PullURIRequest")
public class PullURIRequest {
    @JacksonXmlProperty(localName = "ver")
    private String version;

    @JacksonXmlProperty(localName = "ts")
    private String timestamp;

    @JacksonXmlProperty(localName = "txn")
    private String transactionId;

    @JacksonXmlProperty(localName = "orgId")
    private String organizationId;

    @JacksonXmlProperty(localName = "format")
    private String format;

    @JacksonXmlProperty(localName = "DocDetails")
    private DocDetails docDetails;

    // Add getters and setters for all fields
}

