package com.example.userRegisteration;

import com.fasterxml.jackson.annotation.JsonProperty;



public class SmsRequest {

    @jakarta.validation.constraints.NotBlank
    private final String phoneNumber; // destination

    @jakarta.validation.constraints.NotBlank
    private final String message;

    public SmsRequest(@JsonProperty("phoneNumber") String phoneNumber,
                      @JsonProperty("message") String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }

   
	@Override
    public String toString() {
        return "SmsRequest{" +
                "phoneNumber= ..." + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
