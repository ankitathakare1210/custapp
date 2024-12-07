package com.fullstack.service;

import com.fullstack.model.Customer;

import java.util.Optional;

public interface ICustomerService {
    Customer signUp(Customer customer);

    Boolean signIn(String custEmailId, String custPassword);

    Optional<Customer> findByCustId(int custId);
}
