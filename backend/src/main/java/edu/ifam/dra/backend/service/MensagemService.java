package edu.ifam.dra.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ifam.dra.backend.dto.DTOMensagem;
import edu.ifam.dra.backend.model.Mensagem;
import edu.ifam.dra.backend.repositories.MensagemRepository;

@Service
public class MensagemService {

	@Autowired
	private MensagemRepository mensagemRepository;
	
	@Autowired
	private ContatoService contatoService;
	
	public List<Mensagem> getMensagensReceptor(Long idReceptor){
		return mensagemRepository.findByReceptor(contatoService.getContato(idReceptor));
	}
	
	public List<Mensagem> getMensagensEmissor(Long idEmissor){
		return mensagemRepository.findByEmissor(contatoService.getContato(idEmissor));
	}
	
	public Mensagem setMensagemFromDTOMensagem(DTOMensagem dtoMensagem) {
		Mensagem mensagem = new Mensagem();
		mensagem.setDataHora(dtoMensagem.getDataHora());
		mensagem.setConteudo(dtoMensagem.getConteudo());
		mensagem.setEmissor(contatoService.getContato(dtoMensagem.getEmissor()));
		mensagem.setReceptor(contatoService.getContato(dtoMensagem.getId()));
		return mensagemRepository.save(mensagem);
	}
	
	
}
