package com.niit.microservices.NiitBankingUserService.service;

import com.niit.microservices.NiitBankingUserService.model.Customer;
import com.niit.microservices.NiitBankingUserService.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
