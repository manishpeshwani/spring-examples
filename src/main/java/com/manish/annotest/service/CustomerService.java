package com.manish.annotest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.manish.annotest.model.Customer;
import com.manish.annotest.repository.CustomerRepository;

public interface CustomerService {

	void setCustomerRepository(CustomerRepository customerRepository);

	List<Customer> findAll();

}