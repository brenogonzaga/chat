package edu.ifam.dra.front.model;

import java.util.Calendar;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Mensagem {
    private Long id;
    private Calendar dataHora;
    @NotBlank
    private String conteudo;
    @NotBlank
    private Contato emissor;
    @NotBlank
    private Contato receptor;
}
