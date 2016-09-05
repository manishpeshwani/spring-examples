package com.manish.annotest.service;

import java.util.List;

import com.manish.annotest.repository.CustomerRepository;

import com.manish.annotest.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {

	}

	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection");
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.manish.annotest.service.CustomerService#setCustomerRepository(com.manish.annotest.repository.CustomerRepository)
	 */
	@Override	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");

		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see com.manish.annotest.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
