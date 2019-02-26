package com.tekion.communication.dealerCommunication.DealerCommunication;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "DealerCommunication")
public class DealerCommunication {
    private String _id;
    private String dealerID;
    private PhoneNumber phoneNumber;
    private BdcPhoneNumber bdcPhoneNumber;
    private String autoReplyMessage;
    private DefaultAppointmentReminderPlaceholders defaultAppointmentReminderPlaceholders;
    private String[] allowedNotificationSettingTypes;


    public DealerCommunication(String _id, String dealerID, PhoneNumber phoneNumber, BdcPhoneNumber bdcPhoneNumber, String autoReplyMessage, DefaultAppointmentReminderPlaceholders defaultAppointmentReminderPlaceholders, String[] allowedNotificationSettingTypes) {
        this._id = _id;
        this.dealerID = dealerID;
        this.phoneNumber = phoneNumber;
        this.bdcPhoneNumber = bdcPhoneNumber;
        this.autoReplyMessage = autoReplyMessage;
        this.defaultAppointmentReminderPlaceholders = defaultAppointmentReminderPlaceholders;
        this.allowedNotificationSettingTypes = allowedNotificationSettingTypes;
    }

    public DealerCommunication() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDealerID() {
        return dealerID;
    }

    public void setDealerID(String dealerID) {
        this.dealerID = dealerID;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BdcPhoneNumber getBdcPhoneNumber() {
        return bdcPhoneNumber;
    }

    public void setBdcPhoneNumber(BdcPhoneNumber bdcPhoneNumber) {
        this.bdcPhoneNumber = bdcPhoneNumber;
    }

    public String getAutoReplyMessage() {
        return autoReplyMessage;
    }

    public void setAutoReplyMessage(String autoReplyMessage) {
        this.autoReplyMessage = autoReplyMessage;
    }

    public DefaultAppointmentReminderPlaceholders getDefaultAppointmentReminderPlaceholders() {
        return defaultAppointmentReminderPlaceholders;
    }

    public void setDefaultAppointmentReminderPlaceholders(DefaultAppointmentReminderPlaceholders defaultAppointmentReminderPlaceholders) {
        this.defaultAppointmentReminderPlaceholders = defaultAppointmentReminderPlaceholders;
    }

    public String[] getAllowedNotificationSettingTypes() {
        return allowedNotificationSettingTypes;
    }

    public void setAllowedNotificationSettingTypes(String[] allowedNotificationSettingTypes) {
        this.allowedNotificationSettingTypes = allowedNotificationSettingTypes;
    }
}
