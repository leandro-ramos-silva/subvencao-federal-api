package br.com.bbseguros.subencaofederal.api.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cultura")
public class Cultura implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/*
	 * ID_CULTURA       NUMBER not null,
  		CDATIVIDADEBACEN VARCHAR2(20),
  		NMCULTURAGLOBAL  VARCHAR2(60),
  		DSTIPOLAVOURA    VARCHAR2(20),
  		DSGRUPOCULTURA   VARCHAR2(50),
  		ZONEAMENTOMAPA   VARCHAR2(1)
	 */
	@Id
	private Integer id ;	
	private String codigoAticidadeBacen ;
	private String nomeCulturaGlobal ;
	private String descricaoTipoLavoura ;
	private String descricaoGrupoCultura ;
	private String    zoneaMentoMapa ;
	
	public Cultura() {
		
	}
	
	
	public Cultura(Integer id, String codigoAticidadeBacen, String nomeCulturaGlobal, String descricaoTipoLavoura,
			String descricaoGrupoCultura, String zoneaMentoMapa) {
		super();
		this.id = id;
		this.codigoAticidadeBacen = codigoAticidadeBacen;
		this.nomeCulturaGlobal = nomeCulturaGlobal;
		this.descricaoTipoLavoura = descricaoTipoLavoura;
		this.descricaoGrupoCultura = descricaoGrupoCultura;
		this.zoneaMentoMapa = zoneaMentoMapa;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigoAticidadeBacen() {
		return codigoAticidadeBacen;
	}
	public void setCodigoAticidadeBacen(String codigoAticidadeBacen) {
		this.codigoAticidadeBacen = codigoAticidadeBacen;
	}
	public String getNomeCulturaGlobal() {
		return nomeCulturaGlobal;
	}
	public void setNomeCulturaGlobal(String nomeCulturaGlobal) {
		this.nomeCulturaGlobal = nomeCulturaGlobal;
	}
	public String getDescricaoTipoLavoura() {
		return descricaoTipoLavoura;
	}
	public void setDescricaoTipoLavoura(String descricaoTipoLavoura) {
		this.descricaoTipoLavoura = descricaoTipoLavoura;
	}
	public String getDescricaoGrupoCultura() {
		return descricaoGrupoCultura;
	}
	public void setDescricaoGrupoCultura(String descricaoGrupoCultura) {
		this.descricaoGrupoCultura = descricaoGrupoCultura;
	}
	public String getZoneaMentoMapa() {
		return zoneaMentoMapa;
	}
	public void setZoneaMentoMapa(String zoneaMentoMapa) {
		this.zoneaMentoMapa = zoneaMentoMapa;
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
		Cultura other = (Cultura) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	

}
