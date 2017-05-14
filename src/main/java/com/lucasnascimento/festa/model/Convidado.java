package com.lucasnascimento.festa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private Integer quantidadeAcompanhantes;
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuatidadeAcompanhantes() {
		return quantidadeAcompanhantes;
	}

	public void setQuatidadeAcompanhantes(Integer quatidadeAcompanhantes) {
		this.quantidadeAcompanhantes = quatidadeAcompanhantes;
	}



}
