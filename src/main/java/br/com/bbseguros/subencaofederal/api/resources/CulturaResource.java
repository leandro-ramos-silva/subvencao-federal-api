package br.com.bbseguros.subencaofederal.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bbseguros.subencaofederal.api.domain.Cultura;
import br.com.bbseguros.subencaofederal.api.services.CulturaService;

@RestController
@RequestMapping(value="/culturas")
public class CulturaResource {
	
	@Autowired
	private CulturaService service ;
	
	@RequestMapping(method=RequestMethod.GET)
	
	public ResponseEntity<List<Cultura>> findAll(){
		
		return ResponseEntity.ok().body(service.findAll()) ;
		
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	
	public ResponseEntity<Cultura> findById( @RequestBody Cultura cultura){
		return ResponseEntity.ok().body(service.findByUd(cultura.getId())) ;
	}
	

}
