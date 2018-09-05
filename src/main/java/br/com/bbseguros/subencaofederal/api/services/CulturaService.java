package br.com.bbseguros.subencaofederal.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bbseguros.subencaofederal.api.domain.Cultura;
import br.com.bbseguros.subencaofederal.api.repositories.CulturaRepository;
import br.com.bbseguros.subencaofederal.api.services.exception.ObjectNotFoundExecption;
@Service
public class CulturaService {
	
	@Autowired
	private CulturaRepository repo ;
	/*
	public Optional<T> findByID(){
		
		
	}*/
	public List<Cultura> findAll(){
		
		return repo.findAll() ;
	}
	
	public Cultura findByUd(Integer id) {
		
		Optional<Cultura> obj = repo.findById(id) ;
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundExecption("Nenhuma cultura encontrada") ) ;
		
	}
}
