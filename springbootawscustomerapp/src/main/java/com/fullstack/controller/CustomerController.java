package com.fullstack.controller;

import com.fullstack.model.Customer;
import com.fullstack.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    public ICustomerService customerService;

    @PostMapping("/signup")
    public ResponseEntity<Customer> signUp(@RequestBody Customer customer){
        return ResponseEntity.ok(customerService.signUp(customer));
    }

    @GetMapping("/signin/{custEmailId}/{custPassword}")
    public ResponseEntity<Boolean> signIn(@PathVariable String custEmailId,@PathVariable String custPassword){
        return ResponseEntity.ok(customerService.signIn(custEmailId,custPassword));
    }

    @GetMapping("findbyid/{custId}")
    public ResponseEntity<Optional<Customer>>findById(@PathVariable int custId){
        return ResponseEntity.ok(customerService.findByCustId(custId));
    }
}
