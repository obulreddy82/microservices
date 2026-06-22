package com.rajtechnologies.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "spring-1", fallback = Service1ClientFallBack.class)
public interface Service1Client {
    @GetMapping("/service-1")
    String getService1();
}
