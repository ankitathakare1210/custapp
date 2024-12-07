package com.fullstack.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue



    private int custId;
    private String custName;
    private String custAddress;
    private String custContactNumber;
    private String custAccBalanced;
    @JsonFormat(pattern = "dd-MM-YYYY")
    private Date custDOB;
    private String custEmailId;
    private String custPassword;


    public Customer(String custName, int custId, String custAddress, String custContactNumber, String custAccBalanced, String custEmailId, Date custDOB, String custPassword) {
        this.custName = custName;
        this.custId = custId;
        this.custAddress = custAddress;
        this.custContactNumber = custContactNumber;
        this.custAccBalanced = custAccBalanced;
        this.custEmailId = custEmailId;
        this.custDOB = custDOB;
        this.custPassword = custPassword;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustContactNumber() {
        return custContactNumber;
    }

    public void setCustContactNumber(String custContactNumber) {
        this.custContactNumber = custContactNumber;
    }

    public String getCustAccBalanced() {
        return custAccBalanced;
    }

    public void setCustAccBalanced(String custAccBalanced) {
        this.custAccBalanced = custAccBalanced;
    }

    public Date getCustDOB() {
        return custDOB;
    }

    public void setCustDOB(Date custDOB) {
        this.custDOB = custDOB;
    }

    public String getCustEmailId() {
        return custEmailId;
    }

    public void setCustEmailId(String custEmailId) {
        this.custEmailId = custEmailId;
    }

    public String getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }
}
