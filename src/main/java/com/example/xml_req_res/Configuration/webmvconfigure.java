package com.example.xml_req_res.Configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.xml_req_res.Model.Employee;

@Configuration
public class webmvconfigure implements WebMvcConfigurer{
    @Override
    public void configureContentNegotiation(final ContentNegotiationConfigurer configurer){
        configurer.defaultContentType(MediaType.APPLICATION_XML);
    }
    
}
