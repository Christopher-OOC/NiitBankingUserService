package com.niit.microservices.NiitBankingUserService.controller;

import com.niit.microservices.NiitBankingUserService.model.Customer;
import com.niit.microservices.NiitBankingUserService.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class Webcontroller {

    @Autowired
    private Environment environment;

    private CustomerService customerService;

    public Webcontroller(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/port")
    public String test() {
        return "User Service is ruuning on port " + environment.getProperty("local.server.port");
    }

    @PostMapping
    public ResponseEntity<?> createAccount(@RequestBody Customer customer) {
        Customer returnValue = customerService.createCustomer(customer);
        return ResponseEntity.created(null).body(returnValue);
    }
}
