package com.ascendcorp.ctaworkshop.hotelchiangmai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class HotelChiangMaiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HotelChiangMaiApplication.class, args);
	}

    @Bean
    public WebMvcConfigurerAdapter corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("*").allowedOrigins("*").allowedMethods("POST, GET, OPTIONS, DELETE, PATCH, PUT")
                        .allowedHeaders("X-Requested-With, Content-Type, Accept, Origin, Cache-Control, Authorization, X-WM-AnonymousId, X-WM-CorrelationId, X-Wm-AccessToken, X-Wm-RefreshToken, X-ACT-AccessToken, X-ACT-RefreshToken, X-ACT-ByPassToken")
                        .allowCredentials(false).maxAge(3600);
            }
        };
    }

}
