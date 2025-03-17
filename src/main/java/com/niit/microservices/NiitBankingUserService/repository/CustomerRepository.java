package com.niit.microservices.NiitBankingUserService.repository;

import com.niit.microservices.NiitBankingUserService.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
