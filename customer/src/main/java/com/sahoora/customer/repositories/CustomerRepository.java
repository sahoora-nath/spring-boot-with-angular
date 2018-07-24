package com.sahoora.customer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahoora.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
