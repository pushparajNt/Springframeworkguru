package com.sfg.web.mappers;

import org.mapstruct.Mapper;

import com.sfg.domain.Beer;
import com.sfg.web.modal.BeerDto;
@Mapper
public interface BeerMapper {

	BeerDto beerToBeerDto(Beer beer);
	Beer beerDtoBeer(BeerDto beerDto);
}
