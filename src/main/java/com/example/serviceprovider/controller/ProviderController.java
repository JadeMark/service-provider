package com.example.serviceprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadPoolExecutor;

@RestController
public class ProviderController {

    /*@Autowired
    private DiscoveryClient discoveryClient;*/

    @RequestMapping("provider")
    public String provider() {

        System.out.println("This is Provider(服务提供者)!");

        return "This is Provider(服务提供者)!";
    }
}
