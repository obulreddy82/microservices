package com.rajtechnologies.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientServiceB implements ServiceBController {
    @Override
    public String getServiceB() {
        return "Called Service B";
    }
}
