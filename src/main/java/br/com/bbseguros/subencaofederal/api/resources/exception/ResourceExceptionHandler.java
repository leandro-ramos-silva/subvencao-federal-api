package br.com.bbseguros.subencaofederal.api.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.bbseguros.subencaofederal.api.services.exception.ObjectNotFoundExecption;

@ControllerAdvice
public class ResourceExceptionHandler {

	
	@ExceptionHandler(ObjectNotFoundExecption.class)  
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundExecption e, HttpServletRequest request){
		  HttpStatus status  =  HttpStatus.NOT_FOUND ;
		  StandardError err = new StandardError(System.currentTimeMillis(),
				  status.value(),"Objeto nao encontrado" ,e.getMessage(), request.getRequestURI()) ;
		  return  ResponseEntity.status(status).body(err) ;
	  }
}
