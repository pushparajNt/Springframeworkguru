package com.sfg.services;

import java.util.UUID;

import com.sfg.web.modal.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(UUID customerId);

	CustomerDto addCustomer(CustomerDto customerDto);

	void updateCustomer(UUID customerId);

	void deleteCustomer(UUID customerId);

	
}
