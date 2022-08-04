package com.sfg.web.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sfg.services.CustomerService;
import com.sfg.web.modal.BeerDto;
import com.sfg.web.modal.CustomerDto;

import lombok.Builder;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID customerId)
	{
		return new ResponseEntity<>(customerService.getCustomerById(customerId),HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<CustomerDto> addCustomer(@RequestBody CustomerDto customerDto)
	{
		CustomerDto savedCustomer= customerService.addCustomer(customerDto);
		HttpHeaders headers=new HttpHeaders();
		headers.add("location", "/api/v1/customer/"+savedCustomer.getId().toString());
		return new ResponseEntity<>(headers,HttpStatus.CREATED);
	}
	
	@PutMapping("/{customerid}") //just checking
	public ResponseEntity<CustomerDto> updateCustomer(@PathVariable("customerId") UUID customerId,CustomerDto customerDto)
	{
		customerService.updateCustomer(customerId,customerDto);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/{customerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable("customerId") UUID customerId)
	{
		customerService.deleteCustomer(customerId);
		
	}
}
