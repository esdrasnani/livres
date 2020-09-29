package br.com.livresbs.livres.service.impl;

import br.com.livresbs.livres.dto.EmailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EmailServiceImpl {
    @Autowired
    private MailSender mailSender;
    @Value("${spring.mail.username}")
    private String sender;
    public void sendEmail(EmailDTO email) {
        SimpleMailMessage message =
                prepareSimpleMailMessage(email);
        mailSender.send(message);
    }

    private SimpleMailMessage prepareSimpleMailMessage(EmailDTO email) {
        SimpleMailMessage mailMessage =
                new SimpleMailMessage();
        mailMessage.setTo(email.getTo());
        mailMessage.setFrom(sender);
        mailMessage.setSubject(email.getSubject());
        mailMessage.setSentDate(
                new Date(System.currentTimeMillis()));
        mailMessage.setText(email.getText());
        return mailMessage;

    }
}
