package com.sfg.services;

import java.util.UUID;

import com.sfg.web.modal.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

	BeerDto addNewBeer(BeerDto beerDto);

	void updateBeer(UUID uuid, BeerDto beerDto);

	void deleteBeer(UUID id);

}
