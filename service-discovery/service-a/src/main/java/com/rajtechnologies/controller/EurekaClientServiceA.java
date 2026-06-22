package com.rajtechnologies.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientServiceA implements ServiceAController {
    @Override
    public String getServiceA() {
        return "Service A Called";
    }
}
