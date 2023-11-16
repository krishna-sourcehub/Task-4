package com.example.userRegisteration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@RequestMapping("/api/email")
public class EmailController {

    @Autowired
    private EmailSenderService senderService;

    @PostMapping("/send")
    @CrossOrigin(origins = "*")
    public String sendEmail(@RequestBody EmailRequest emailRequest) throws MessagingException {
        senderService.sendSimpleEmail(
		        emailRequest.getRecipient(),
		        emailRequest.getBody(),
		        emailRequest.getSubject()
		);
		return "Email sent successfully!";
    }
}

