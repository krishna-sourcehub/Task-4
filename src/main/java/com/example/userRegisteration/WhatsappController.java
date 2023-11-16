package com.example.userRegisteration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatsappController {

    private final WhatsappService whatsappService;

    @Autowired
    public WhatsappController(WhatsappService whatsappService) {
        this.whatsappService = whatsappService;
    }

    @PostMapping("/send-whatsapp")
    public void sendWhatsAppMessage(@RequestBody WhatsappRequest request) {
        whatsappService.sendWhatsAppMessage(request.getTo(), request.getMessage());
    }
}
