package com.sfg.web.mappers;

import org.mapstruct.Mapper;

import com.sfg.domain.Customer;
import com.sfg.web.modal.CustomerDto;
@Mapper
public interface CustomerMapper {
	
	Customer customerDtoToCustomer(CustomerDto customerDto);
	CustomerDto customerToCustomerDto(Customer customer);

}
