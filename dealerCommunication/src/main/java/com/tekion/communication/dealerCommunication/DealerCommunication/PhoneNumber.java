package com.tekion.communication.dealerCommunication.DealerCommunication;

public class PhoneNumber {
    private String service;

    public PhoneNumber() {
    }

    public PhoneNumber(String service) {
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
