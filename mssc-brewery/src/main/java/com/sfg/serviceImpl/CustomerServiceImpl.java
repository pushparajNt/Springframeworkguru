package com.sfg.serviceImpl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.sfg.services.CustomerService;
import com.sfg.web.modal.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		
		return CustomerDto.builder().id(UUID.randomUUID())
				.name("Pushparaj")
				.build();
	}

}
