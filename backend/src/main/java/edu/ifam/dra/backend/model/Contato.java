package edu.ifam.dra.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class Contato {

	/*
	 * {
	 * "nome": "Isadora",
	 * "email": "isadora@ifam.edu.br",
	 * "telefone" : "(92) 99999-8888",
	 * "endereco" : "Av. 7 de Setembro, 1975",
	 * "bairro" : "Centro",
	 * "cidade" : "Manaus",
	 * "estado" : "AM"
	 * }
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;

	public Contato(String nome, String email, String telefone, String endereco, String bairro, String cidade,
			String estado) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

}
