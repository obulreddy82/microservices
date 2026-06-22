package com.rajtechnologies.controller;

import com.rajtechnologies.client.Service1Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {

    private final Service1Client service1Client;

    public Service2Controller(Service1Client service1Client) {
        this.service1Client = service1Client;
    }

    @GetMapping("/service-2")
    public String getService2() {
      //  String service1Message = service1Client.getService1();
       // System.out.println("Service 1: " + service1Message);
        return "Service 2 Called";
    }
}
