package edu.ifam.dra.backend.model;

import java.util.Calendar;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Mensagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Calendar dataHora;
	private String conteudo;
	@ManyToOne
	private Contato emissor;
	@ManyToOne
	private Contato receptor;

}
