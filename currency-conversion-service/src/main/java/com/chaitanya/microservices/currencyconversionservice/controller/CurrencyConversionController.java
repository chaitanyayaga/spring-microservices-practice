package com.chaitanya.microservices.currencyconversionservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeProxy currencyExchangeProxy;
	
	@GetMapping("currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversion(
			@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		CurrencyConversion currencyConversion =currencyExchangeProxy.retrieveExchangevalue(from, to);
		
		return new CurrencyConversion(currencyConversion.getId(),
				from,to,quantity,
				currencyConversion.getConversionMutiple(),
				quantity.multiply(currencyConversion.getConversionMutiple()),
				currencyConversion.getEnvironment() + " Feign client");
	}

}
