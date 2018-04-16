package com.ascendcorp.ctaworkshop.hotelchiangmai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class HotelChiangMaiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HotelChiangMaiApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(HotelChiangMaiApplication.class, args);
	}
}
