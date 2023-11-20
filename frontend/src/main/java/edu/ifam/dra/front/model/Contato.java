package edu.ifam.dra.front.model;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Contato {
	private Long id;
	@NotBlank
	private String nome;
	@Email
	@NotBlank
	private String email;
	@NotBlank
	private String telefone;
	@NotBlank
	private String endereco;
	@NotBlank
	private String bairro;
	@NotBlank
	private String cidade;
	@NotBlank
	private String estado;

}