package com.example.userRegisteration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("twilio")
public class TwilioConfiguration {

    private String accountSid;
    private String authToken;
    private String fromNumber;
    private String wfromNumber;
    
	
	@Override
	public String toString() {
		return "TwilioConfiguration [accountSid=" + accountSid + ", authToken=" + authToken + ", fromNumber="
				+ fromNumber + ", wfromNumber=" + wfromNumber + "]";
	}
	
	public String getWfromNumber() {
		return wfromNumber;
	}

	public void setWfromNumber(String wfromNumber) {
		this.wfromNumber = wfromNumber;
	}

	public String getAccountSid() {
		return accountSid;
	}
	public void setAccountSid(String accountSid) {
		this.accountSid = accountSid;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getFromNumber() {
		return fromNumber;
	}
	public void setFromNumber(String fromNumber) {
		this.fromNumber = fromNumber;
	}
	public TwilioConfiguration() {
	
	}
    
    


}
