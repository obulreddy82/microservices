package com.rajtechnologies.client;

import org.springframework.stereotype.Component;

@Component
public class Service1ClientFallBack implements Service1Client {
    @Override
    public String getService1() {
        return "Service 1 Fallback";
    }
}
