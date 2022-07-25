package com.sfg.serviceImpl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.sfg.services.BeerService;
import com.sfg.web.modal.BeerDto;
@Service
public class BeerServiceImpl  implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("king fisher")
				.beerStyle("Pale Ale")
				.build();
	}

	
}
