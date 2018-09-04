package br.com.bbseguros.subencaofederal.api.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.bbseguros.subencaofederal.api.domain.Cultura;
import br.com.bbseguros.subencaofederal.api.repositories.CulturaRepository;



@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private CulturaRepository culturaRepo ;
	@Override
	public void run(String... args) throws Exception {
		
		culturaRepo.deleteAll();		
		String fileName = "massa.txt";		
		List<String> list = new ArrayList<>();
		
		try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

			list = br.lines().collect(Collectors.toList());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		Integer i = 1 ;
		for(String strCultura : list ) {
			
			String[] params = strCultura.split(",") ;
			culturaRepo.save(new Cultura(i++,params[0].trim(),params[1].trim(),params[2].trim(),params[3].trim(),params[4].trim())) ;
			
			
		} 
		
		//list.forEach;
		
		
		
		//culturaRepo.saveAll(Arrays.asList(cultura1,cultura2)) ;

	}

}
