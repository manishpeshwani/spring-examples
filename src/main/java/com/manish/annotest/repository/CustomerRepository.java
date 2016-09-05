package com.manish.annotest.repository;

import java.util.List;

import com.manish.annotest.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}