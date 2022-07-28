package com.sfg.serviceImpl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.sfg.services.CustomerService;
import com.sfg.web.modal.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		
		return CustomerDto.builder().id(UUID.randomUUID())
				.name("Pushparaj")
				.build();
	}

	@Override
	public CustomerDto addCustomer(CustomerDto customerDto) {
		
		
		return CustomerDto.builder().id(UUID.randomUUID())
				.name("Nirmal Kumar")
				.build();
	}

	@Override
	public void updateCustomer(UUID customerId,CustomerDto customerDto) {
	
		//implementation needs to be added
		
	}

	@Override
	public void deleteCustomer(UUID customerId) {
		
		log.debug("Implenmentaion needs to be added");
	}

}
