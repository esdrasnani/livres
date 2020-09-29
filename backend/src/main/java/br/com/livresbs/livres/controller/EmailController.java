package br.com.livresbs.livres.controller;

import br.com.livresbs.livres.dto.EmailDTO;
import br.com.livresbs.livres.service.impl.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "email")
public class EmailController {
    @Autowired
    private EmailServiceImpl service;
    @PostMapping("/simples")
    public ResponseEntity<?> enviarEmail(@RequestBody EmailDTO email) {
        try {
            service.sendEmail(email);
            return ResponseEntity.ok("E-mail simples enviado");
        } catch(MailException e) {
            return ResponseEntity.badRequest()
                    .body(e.getMessage());
        }
    }

}
