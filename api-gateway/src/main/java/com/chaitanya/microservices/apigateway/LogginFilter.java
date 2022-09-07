package com.chaitanya.microservices.apigateway;

import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import ch.qos.logback.classic.Logger;
import reactor.core.publisher.Mono;

@Component
public class LogginFilter implements GlobalFilter{
	
	private Logger logger = (Logger) LoggerFactory.getLogger(LogginFilter.class);

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logger.info("PATH OF REQUEST RECEIVED IS" + exchange.getRequest().getPath());
		return chain.filter(exchange);
	}

}
