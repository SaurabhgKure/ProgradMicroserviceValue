package com.Prograd.Microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ValueController {
    @Autowired
    private ValueConfig valueConfiguration;
    @GetMapping("/values")
    public ValueConfig retrieveValue()
    {
        return new ValueConfig(valueConfiguration.getMin(),valueConfiguration.getMax());
    }


}
