package br.com.fiap.oceantechapi.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document
public class Metas {

	@Field
	private String meta;
	@Field
	private String nacoesUnidas;
	@Field
	private String brasil;
	@Field
	private String indicadores;

	public Metas(String meta, String nacoesUnidas, String brasil, String indicadores) {
		super();
		this.meta = meta;
		this.nacoesUnidas = nacoesUnidas;
		this.brasil = brasil;
		this.indicadores = indicadores;
	}

}
