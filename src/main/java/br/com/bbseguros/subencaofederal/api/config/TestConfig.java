package br.com.bbseguros.subencaofederal.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Bean
	public boolean instantiateDataBase() {
		
		
		
		return true ;
	} 
	
}
