package com.example.userRegisteration;

public class WhatsappRequest {
   
	private String to;
    private String message;
    
	public WhatsappRequest() {

	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "WhatsappRequest [to=" + to + ", message=" + message + "]";
	}

}
