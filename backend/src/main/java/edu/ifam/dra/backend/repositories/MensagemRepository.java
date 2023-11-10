package edu.ifam.dra.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifam.dra.backend.model.Contato;
import edu.ifam.dra.backend.model.Mensagem;

import java.util.List;


public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
	List<Mensagem> findByReceptor(Contato receptor);
	List<Mensagem> findByEmissor(Contato emissor);
}
