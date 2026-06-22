package com.rajtechnologies.service;

import com.rajtechnologies.client.Service1Client;
import org.springframework.stereotype.Service;

@Service
public class CircuiteBreakerFeignService {

    private final Service1Client service1Client;


    public CircuiteBreakerFeignService(Service1Client service1Client) {
        this.service1Client = service1Client;
    }

    public String getService1(){
        return service1Client.getService1();
    }
}
