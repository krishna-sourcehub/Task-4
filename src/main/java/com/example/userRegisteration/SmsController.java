package com.example.userRegisteration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sms")
public class SmsController {

    private final TwilioService twilioService;

    @Autowired
    public SmsController(TwilioService twilioService) {
        this.twilioService = twilioService;
    }
    @PostMapping
    @CrossOrigin(origins = "*")
    public String sendSms(@RequestBody SmsRequest smsRequest) {
        twilioService.sendSms(smsRequest.getPhoneNumber(), smsRequest.getMessage());
        return "SMS sent successfully!";
    }
}
