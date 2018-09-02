package br.com.bbseguros.subencaofederal.api.domain;

import java.io.Serializable;
import java.util.Date;

public class Proposta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private Integer id ;
	private String  nomeSegurado ;
	private Date dataInicioVigencia ;
	
	public Proposta () {
		
	}

	public Proposta(Integer id, String nomeSegurado, Date dataInicioVigencia) {
		super();
		this.id = id;
		this.nomeSegurado = nomeSegurado;
		this.dataInicioVigencia = dataInicioVigencia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeSegurado() {
		return nomeSegurado;
	}

	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}

	public Date getDataInicioVigencia() {
		return dataInicioVigencia;
	}

	public void setDataInicioVigencia(Date dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proposta other = (Proposta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	} ;
	
	
	
	
	
	
}
