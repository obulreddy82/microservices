package com.rajtechnologies.controller;

import org.springframework.cloud.client.serviceregistry.ServiceRegistryAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientServiceB implements ServiceBController {
    @Override
    public String getServiceA() {
        return "Called Service A";
    }
}
