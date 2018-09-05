package br.com.bbseguros.subencaofederal.api.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="proposta")
public class Proposta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/*
	 *  ID_PROPOSTA                 INTEGER not null,  
  		NUM_PROPOSTA_SEGURADORA     VARCHAR2(20),
  		NUM_PROGRAMA_SUBVENCAO      INTEGER,
  		FEC_INICIO_VIGENCIA         DATE,
  		FEC_PROPOSTA                DATE,
  		FEC_TERMINO_VIGENCIA        DATE,
  		VAL_CUSTO_EMISSAO           NUMBER(17,2),
  		VAL_PREMIO_LIQUIDO          NUMBER(17,2),
  		VAL_SUBVENCAO_FEDERAL       NUMBER(17,2),
  		NOM_SEGURADO                VARCHAR2(100),
  		TIP_DOCUMENTO               VARCHAR2(4),
  		NUM_DOCUMENTO(CPF\CNPJ)               VARCHAR2(20),
  		VAL_LIMITE_SEGURADO         NUMBER(17,2),
  		NOM_BAIRRO                  VARCHAR2(50),
  		NUM_CEP                     VARCHAR2(8),
  		NOM_COMPL_LOGRADOURO        VARCHAR2(60),
  		NUM_COMPL_LOGRADOURO        VARCHAR2(20),
  		NOM_PROPRIEDADE             VARCHAR2(60),
  		NOM_BAIRRO_PROPRIEDADE      VARCHAR2(60),
  		NUM_CEP_PROPRIEDADE         VARCHAR2(8),
  		NOM_COMPL_PROPRIEDADE       VARCHAR2(50),
  		NUM_COMPL_PROPRIEDADE       VARCHAR2(10),
  		NUM_TELEFONE                VARCHAR2(20),
  		NUM_ANIMAIS                 INTEGER,
  		NUM_ANO_SAFRA               VARCHAR2(9),
  		NUM_AREA_SEGURADA           NUMBER(9,2),
  		NUM_CULTURA_BACEN           VARCHAR2(14),
  		NUM_PES                     INTEGER,
  		NUM_PRODUTIVIDADE           NUMBER(12,2),
  		NUM_VOLUMES                 NUMBER(9,2),
  		NUM_LAT_COT_GRAU_GPS        VARCHAR2(10),
  		NUM_LAT_COT_MINUTO_GPS      VARCHAR2(10),
  		VAL_LAT_COT_SEGUNDO_GPS     VARCHAR2(10),
  		NOM_ORIENT_LAT_PROPRIEDADE  VARCHAR2(1),
  		NUM_LONG_COT_GRAU_GPS       VARCHAR2(10),
  		NUM_LONG_COT_MINUTO_GPS     VARCHAR2(10),
  		VAL_LONG_COT_SEGUNDO_GPS    VARCHAR2(10),
  		NOM_ORIENT_LONG_PROPRIEDADE VARCHAR2(1),
  		NUM_APOLICE                 VARCHAR2(20),
  		FEC_EMISSAO_APOLICE         DATE,
  		COD_STATUS_APOLICE          INTEGER,  		
  		NUM_LOTE_SEGBR              INTEGER,
  		NUM_PROPOSTA_MAPA           VARCHAR2(20),
  		COD_STATUS                  INTEGER,
  		VAL_SUBVENCAO_FEDERAL_REAL  NUMBER(17,2),
  		COD_RAMO                    NUMBER(5),
  		NOM_CIDADE_PROPRIEDADE      VARCHAR2(75),
  		NOM_CIDADE_SEGURADO         VARCHAR2(75),
  		UF_CEP_PROPRIEDADE          VARCHAR2(2),
  		UF_CEP_SEGURADO             VARCHAR2(2),
  		ENDOSSO_ID                  NUMBER(5),
  		FEC_EMISION_SPTO_30         DATE,
  		NRO_PROCESSO_SUSEP          NUMBER(17),
  		NRO_PRODUTIVIDADE_ESTIMADA  NUMBER(12,2),
  		PERC_NIVEL_COBERTURA        NUMBER(2),
  		COD_CLASSIF_PRODUTO         NUMBER(2),
    
	 * 
	 * 
	 */
	@Id
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
