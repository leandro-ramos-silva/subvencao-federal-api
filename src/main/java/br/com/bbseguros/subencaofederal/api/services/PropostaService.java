package br.com.bbseguros.subencaofederal.api.services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.bbseguros.subencaofederal.api.domain.Proposta;
import br.com.bbseguros.subencaofederal.api.repositories.PropostaRepository;

@Service
public class PropostaService  {
	
	@Autowired
	private PropostaRepository propostaRepo ;
	
	public List <Proposta> findAll(){
		
		return propostaRepo.findAll() ;
		
	}
}
