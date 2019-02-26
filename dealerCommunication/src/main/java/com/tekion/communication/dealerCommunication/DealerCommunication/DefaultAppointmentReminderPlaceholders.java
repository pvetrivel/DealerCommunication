package com.tekion.communication.dealerCommunication.DealerCommunication;

public class DefaultAppointmentReminderPlaceholders {
    private String appointmentReminderTextTemplate;
    private String appointmentReminderEmailTemplate;
    private String appointmentReminderTimeFormat;  //check
    private String dealerAddressURLSample;
private String applicationURLSample;
private String dealerNamePlaceholderSampleOption1;
private String dealerNamePlaceholderSampleOption2;
private String dealerNamePlaceholderSampleOption3;

    public DefaultAppointmentReminderPlaceholders(String appointmentReminderTextTemplate, String appointmentReminderEmailTemplate, String appointmentReminderTimeFormat, String dealerAddressURLSample, String applicationURLSample, String dealerNamePlaceholderSampleOption1, String dealerNamePlaceholderSampleOption2, String dealerNamePlaceholderSampleOption3) {
        this.appointmentReminderTextTemplate = appointmentReminderTextTemplate;
        this.appointmentReminderEmailTemplate = appointmentReminderEmailTemplate;
        this.appointmentReminderTimeFormat = appointmentReminderTimeFormat;
        this.dealerAddressURLSample = dealerAddressURLSample;
        this.applicationURLSample = applicationURLSample;
        this.dealerNamePlaceholderSampleOption1 = dealerNamePlaceholderSampleOption1;
        this.dealerNamePlaceholderSampleOption2 = dealerNamePlaceholderSampleOption2;
        this.dealerNamePlaceholderSampleOption3 = dealerNamePlaceholderSampleOption3;
    }

    public DefaultAppointmentReminderPlaceholders() {
    }

    public String getAppointmentReminderTextTemplate() {
        return appointmentReminderTextTemplate;
    }

    public void setAppointmentReminderTextTemplate(String appointmentReminderTextTemplate) {
        this.appointmentReminderTextTemplate = appointmentReminderTextTemplate;
    }

    public String getAppointmentReminderEmailTemplate() {
        return appointmentReminderEmailTemplate;
    }

    public void setAppointmentReminderEmailTemplate(String appointmentReminderEmailTemplate) {
        this.appointmentReminderEmailTemplate = appointmentReminderEmailTemplate;
    }

    public String getAppointmentReminderTimeFormat() {
        return appointmentReminderTimeFormat;
    }

    public void setAppointmentReminderTimeFormat(String appointmentReminderTimeFormat) {
        this.appointmentReminderTimeFormat = appointmentReminderTimeFormat;
    }

    public String getDealerAddressURLSample() {
        return dealerAddressURLSample;
    }

    public void setDealerAddressURLSample(String dealerAddressURLSample) {
        this.dealerAddressURLSample = dealerAddressURLSample;
    }

    public String getApplicationURLSample() {
        return applicationURLSample;
    }

    public void setApplicationURLSample(String applicationURLSample) {
        this.applicationURLSample = applicationURLSample;
    }

    public String getDealerNamePlaceholderSampleOption1() {
        return dealerNamePlaceholderSampleOption1;
    }

    public void setDealerNamePlaceholderSampleOption1(String dealerNamePlaceholderSampleOption1) {
        this.dealerNamePlaceholderSampleOption1 = dealerNamePlaceholderSampleOption1;
    }

    public String getDealerNamePlaceholderSampleOption2() {
        return dealerNamePlaceholderSampleOption2;
    }

    public void setDealerNamePlaceholderSampleOption2(String dealerNamePlaceholderSampleOption2) {
        this.dealerNamePlaceholderSampleOption2 = dealerNamePlaceholderSampleOption2;
    }

    public String getDealerNamePlaceholderSampleOption3() {
        return dealerNamePlaceholderSampleOption3;
    }

    public void setDealerNamePlaceholderSampleOption3(String dealerNamePlaceholderSampleOption3) {
        this.dealerNamePlaceholderSampleOption3 = dealerNamePlaceholderSampleOption3;
    }
}
