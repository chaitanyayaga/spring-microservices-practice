package com.chaitanya.microservices.currencyconversionservice.controller;

import java.math.BigDecimal;

public class CurrencyConversion {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal conversionMutiple;
	private BigDecimal totalCalculatedAmount;
	private String environment;
	

	public CurrencyConversion() {
		super();
	}
	
	public CurrencyConversion(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMutiple, 
			BigDecimal totalCalculatedAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMutiple = conversionMutiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.environment = environment;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMutiple() {
		return conversionMutiple;
	}
	public void setConversionMutiple(BigDecimal conversionMutiple) {
		this.conversionMutiple = conversionMutiple;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}

}
