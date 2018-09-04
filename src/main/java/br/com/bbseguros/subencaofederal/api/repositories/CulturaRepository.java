package br.com.bbseguros.subencaofederal.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.bbseguros.subencaofederal.api.domain.Cultura;

@Repository
public interface  CulturaRepository extends MongoRepository <Cultura,Integer> {
	
	

}
