package com.service.lovlov.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-04-09T12:44:48.399Z")

@RestSchema(schemaId = "lovlov")
@RequestMapping(path = "/lovlov", produces = MediaType.APPLICATION_JSON)
public class LovlovImpl {

    @Autowired
    private LovlovDelegate userLovlovDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userLovlovDelegate.helloworld(name);
    }

}
