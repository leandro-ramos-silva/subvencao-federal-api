package br.com.bbseguros.subencaofederal.api.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bbseguros.subencaofederal.api.domain.Proposta;
import br.com.bbseguros.subencaofederal.api.services.PropostaService;

@RestController
@RequestMapping(value="/propostas")
public class PropostaResource {
	
	@Autowired 
	private PropostaService service ;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Proposta>> findAll(){
	
		 //Proposta prop1  = new Proposta(1, "Maria teste", new Date()) ;
		 //Proposta prop2  = new Proposta(1, "Joao teste", new Date()) ;
		 List <Proposta> list = service.findAll() ;
		 //list.addAll(Arrays.asList(prop1, prop2)) ;
		 return ResponseEntity.ok().body(list) ;	 
		 
	}

}
