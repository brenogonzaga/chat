package edu.ifam.dra.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifam.dra.backend.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
