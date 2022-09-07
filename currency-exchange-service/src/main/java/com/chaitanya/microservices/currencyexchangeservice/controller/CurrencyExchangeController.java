package com.chaitanya.microservices.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.chaitanya.microservices.currencyexchangeservice.model.CurrencyExchange;
import com.chaitanya.microservices.currencyexchangeservice.repository.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeRepository currencyExchangeRepository;
	

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangevalue(@PathVariable String from,
			@PathVariable String to) {
		String port = environment.getProperty("local.server.port");
		CurrencyExchange currencyExchange = currencyExchangeRepository.findByFromAndTo(from, to);
		if(currencyExchange == null) {
			throw new RuntimeException("Umable to find currency excahnge from "+ from + " and "+to);
		}
		
		currencyExchange.setEnvironment(port);
		return currencyExchange;
	}

}
