package edu.ifam.dra.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import edu.ifam.dra.front.model.Contato;
import edu.ifam.dra.front.service.ContatoFrontService;

@Controller
@RequestMapping("/mensagem")
public class MensagemFrontController {

    @Autowired
    ContatoFrontService contatoFrontService;

    @PostMapping("/enviar/{id}")
    public String alterarContato(@PathVariable Long id, @Validated Contato contato, BindingResult result, Model model) {
        model.addAttribute("contato", contatoFrontService.getContato(id));
        model.addAttribute("mensagem", contatoFrontService.getContato(id));
        return "enviarMensagem";
    }
}
