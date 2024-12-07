package com.fullstack.service;

import com.fullstack.model.Customer;
import com.fullstack.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer signUp(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Boolean signIn(String custEmailId, String custPassword) {
        boolean flag=false;
        Customer customer=customerRepository.findByCustEmailIdAndCustPassword(custEmailId,custPassword);
       if(customer!=null && customer.getCustEmailId().equals(custEmailId) && customer.getCustPassword().equals(custPassword)){
           flag=true;
       }
        return flag;
    }

    @Override
    public Optional<Customer> findByCustId(int custId) {
        return customerRepository.findById(custId);
    }
}
