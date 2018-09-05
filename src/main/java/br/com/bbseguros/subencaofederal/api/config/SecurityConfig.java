package br.com.bbseguros.subencaofederal.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private Environment env ;
	
	
	private static final String[] PUBLIC_MATCHERS = {
			"/h2-console/**",
		
	} ;
	private static final String[] PUBLIC_MATCHERS_GET = {
			"/proposta/**",
		
	} ;
	
	@Override
	public void configure(WebSecurity web) throws Exception{
		
			 web.ignoring().antMatchers("/v2/api-docs", "/configuration/ui", "/swagger-resources/**", "/configuration/**",
			"/swagger-ui.html", "/webjars/**");
		
	}

}
