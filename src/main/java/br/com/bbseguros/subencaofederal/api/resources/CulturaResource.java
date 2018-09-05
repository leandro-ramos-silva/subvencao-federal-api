package br.com.bbseguros.subencaofederal.api.resources;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bbseguros.subencaofederal.api.domain.Cultura;
import br.com.bbseguros.subencaofederal.api.dto.CulturaDTO;
import br.com.bbseguros.subencaofederal.api.services.CulturaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value="/culturas")

public class CulturaResource {
	
	@Autowired
	private CulturaService service ;
	
	@RequestMapping(method=RequestMethod.GET)	
	@ApiOperation(value="Retorna lista de todas as culturas")
	public ResponseEntity<List<CulturaDTO>> findAll(){		
		
		List<CulturaDTO> listDTO = service.findAll().stream().map(x -> new CulturaDTO(x)).collect(Collectors.toList()) ;		
		
		return ResponseEntity.ok().body(listDTO) ;
		
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ApiOperation(value="Retorna a cultura pelo ID")
	@ApiResponses(value = {		
			@ApiResponse(code = 404, message = "Codigo inexistente") })
	public ResponseEntity<Cultura> findById( @RequestBody Cultura cultura){
		return ResponseEntity.ok().body(service.findByUd(cultura.getId())) ;
	}
	
	
	// metodo implementado com tratamento especial
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	@ApiOperation(value="Retorna a cultura pelo ID")
	@ApiResponses(value = {		
			@ApiResponse(code = 404, message = "Codigo inexistente") })
	public ResponseEntity<Cultura> findById( @PathVariable Integer id ){
		return ResponseEntity.ok().body(service.findByUd(id)) ;
	}
	

}
