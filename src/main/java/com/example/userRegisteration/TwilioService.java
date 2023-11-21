package com.example.userRegisteration;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TwilioService {

    @Value("${twilio.phone.number}")
    private String twilioPhoneNumber;

    public void sendSms(String phoneNumber, String message) {
        Message sendmessage = Message.creator(
                new PhoneNumber(phoneNumber),
                new PhoneNumber(twilioPhoneNumber),
                message)
                .create();

        System.out.println("SMS sent with SID: " + sendmessage.getSid());
    }
}
