package com.smartroute.demosecurity.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendVerificationEmail(String to, String subject, String text) throws MessagingException {
         MimeMessage message = javaMailSender.createMimeMessage();
         MimeMessageHelper helper = new MimeMessageHelper(message, true);

         helper.setTo(to);
         helper.setSubject(subject);
         helper.setText(text, true);

         javaMailSender.send(message);
    }

}
