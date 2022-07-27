package com.sfg.web.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfg.services.BeerService;
import com.sfg.web.modal.BeerDto;
import com.sfg.web.modal.CustomerDto;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {
	
	@Autowired
	private  BeerService beerService;
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId)
	{
		System.out.println("just checking");
		return new ResponseEntity<>(beerService.getBeerById(beerId),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<CustomerDto> addNewBeer(BeerDto beerDto)
	{
		BeerDto savedDto=beerService.addNewBeer(beerDto);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("location", "/api/v1/beer"+savedDto.getId().toString());
		return new ResponseEntity<>(httpHeaders,HttpStatus.CREATED);
		
	}

}
