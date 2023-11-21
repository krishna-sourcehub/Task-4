package com.example.userRegisteration;
import com.twilio.Twilio;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TwilioInitializer {

    public TwilioInitializer(@Value("${twilio.account.sid}") String accountSid,
                             @Value("${twilio.auth.token}") String authToken) {
        Twilio.init(accountSid, authToken);
    }
}
