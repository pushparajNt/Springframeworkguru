package com.sfg.serviceImpl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.sfg.services.BeerService;
import com.sfg.web.modal.BeerDto;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class BeerServiceImpl  implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("king fisher")
				.beerStyle("Pale Ale")
				.build();
	}

	@Override
	public BeerDto addNewBeer(BeerDto beerDto) {
		
		return BeerDto.builder().id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateBeer(UUID uuid, BeerDto beerDto) {
		
		//method needs to be implemented in the future
		
	}

	@Override
	public void deleteBeer(UUID id) {
		// TODO Auto-generated method stub
		log.debug("Deleteing the beeer");
	}

	
}
