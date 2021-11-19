package br.com.fiap.oceantechapi.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document
public class Objetivos {

	@Id
	private String id;
	@Field
	private String titulo;
	@Field
	private String descricao;
	@Field
	private List<List<Metas>> metas;

	public Objetivos(String titulo, String descricao, List<List<Metas>> metas) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.metas = metas;
	}
}
