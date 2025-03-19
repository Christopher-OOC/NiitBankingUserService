package com.niit.microservices.NiitBankingUserService.service;

import com.niit.microservices.NiitBankingUserService.model.Account;
import com.niit.microservices.NiitBankingUserService.model.Customer;
import com.niit.microservices.NiitBankingUserService.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;
    private RestTemplate restTemplate;

    public CustomerService(CustomerRepository customerRepository, RestTemplate restTemplate) {
        this.customerRepository = customerRepository;
        this.restTemplate = restTemplate;
    }

    public Customer createCustomer(Customer customer) {
        Customer saved = customerRepository.save(customer);
        String url = "http://NIITBANKINGAPIACCOUNTMANAGEMENT/accounts/" + saved.getId();

        ResponseEntity<Account> accountResponseEntity = restTemplate.postForEntity(url, null, Account.class);

        return saved;
    }

    public void deposit(double amount) {


    }
}
