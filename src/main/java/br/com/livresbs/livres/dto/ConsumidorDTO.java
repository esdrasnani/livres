package br.com.livresbs.livres.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConsumidorDTO {
	private String nome;
	private String sobrenome;
	private String cpf;
	private String senha;
	private Long precomunidade;

	public ConsumidorDTO(String nome, String sobrenome, String cpf, String senha, Long precomunidade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.senha = senha;
		this.precomunidade = precomunidade;
	}

}
