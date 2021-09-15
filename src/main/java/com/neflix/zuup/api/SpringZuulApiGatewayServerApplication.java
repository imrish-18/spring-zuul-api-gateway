package com.neflix.zuup.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class SpringZuulApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulApiGatewayServerApplication.class, args);
		
		System.out.println("hello this is an zuul api gateway server");
	}

  
	/*
	 * @Bean public ALwaysSampmler defaultSampler() { return new AlwaysSampler(); }
	 */

}
