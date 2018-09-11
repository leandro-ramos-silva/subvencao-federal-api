package br.com.bbseguros.subencaofederal.api.dto;

import java.io.Serializable;

import br.com.bbseguros.subencaofederal.api.domain.Cultura;

public class CulturaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String codigoAticidadeBacen;
	private String nomeCulturaGlobal;
	private String descricaoTipoLavoura;
	private String descricaoGrupoCultura;
	private String zoneaMentoMapa;

	public CulturaDTO() {

	}

	public CulturaDTO(Cultura obj) {
		id = obj.getId() ;
		codigoAticidadeBacen = obj.getCodigoAticidadeBacen() ;
		nomeCulturaGlobal = obj.getNomeCulturaGlobal() ;
		descricaoGrupoCultura  = obj.getDescricaoGrupoCultura() ;
		descricaoTipoLavoura = obj.getDescricaoTipoLavoura() ;
		zoneaMentoMapa = obj.getZoneaMentoMapa() ;
		
		
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
	
	

}
