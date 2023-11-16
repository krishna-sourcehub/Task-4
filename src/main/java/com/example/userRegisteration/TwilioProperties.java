package com.example.userRegisteration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("twilio")
public class TwilioProperties {

    private String accountSid;
    private String authToken;
    private String fromNumber;
    private String wfromNumber;
    
	public String getWfromNumber() {
		return wfromNumber;
	}

	public void setWfromNumber(String wfromNumber) {
		this.wfromNumber = wfromNumber;
	}

	public TwilioProperties() {

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

	@Override
	public String toString() {
		return "TwilioProperties [accountSid=" + accountSid + ", authToken=" + authToken + ", fromNumber=" + fromNumber
				+ ", wfromNumber=" + wfromNumber + "]";
	}


}
