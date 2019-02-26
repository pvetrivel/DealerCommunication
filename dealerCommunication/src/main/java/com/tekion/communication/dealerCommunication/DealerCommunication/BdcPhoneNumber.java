package com.tekion.communication.dealerCommunication.DealerCommunication;

public class BdcPhoneNumber {
   private String service;

    public BdcPhoneNumber() {
    }

    public BdcPhoneNumber(String service) {
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
