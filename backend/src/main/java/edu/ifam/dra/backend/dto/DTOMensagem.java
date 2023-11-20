package edu.ifam.dra.backend.dto;

import java.util.Calendar;

import edu.ifam.dra.backend.model.Mensagem;
import lombok.Data;

@Data
public class DTOMensagem {
	private Long id;
	private Calendar dataHora;
	private String conteudo;
	private Long emissor;
	private Long receptor;

	public DTOMensagem(Mensagem mensagem) {
		this.id = mensagem.getId();
		this.dataHora = mensagem.getDataHora();
		this.conteudo = mensagem.getConteudo();
		this.emissor = mensagem.getEmissor().getId();
		this.receptor = mensagem.getReceptor().getId();
	}

}
