package com.notificationsystem.model;

import com.notificationsystem.sender.NotificationSender;
import com.notificationsystem.sender.impl.AppNotification;

import java.time.LocalDate;

public class Notification {
    private static int sequence = 1;

    private final int code;
    private String recipient;
    private String message;
    private final LocalDate dateSent;
    private boolean status;
    private TypeNotification type;
    private NotificationSender sender;

    public Notification(String recipient, String message, TypeNotification type, NotificationSender sender) {
        this.code = sequence++;
        this.recipient = recipient;
        this.message = message;
        this.dateSent = LocalDate.now();
        this.status = false;
        this.type = type;
        this.sender = sender != null ? sender : new AppNotification();
    }

    public int getCode() {
        return code;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public LocalDate getDataSent() {
        return dateSent;
    }

    public LocalDate getDateSent() {
        return dateSent;
    }

    public boolean getStatus() {
        return status;
    }

    public TypeNotification getType() {
        return type;
    }

    public NotificationSender getSender() {
        return sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setType(TypeNotification type) {
        this.type = type;
    }


    public void sendNotification() {
        sender.send();
        this.status = true;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "code=" + code +
                ", recipient='" + recipient + '\'' +
                ", message='" + message + '\'' +
                ", dateSent=" + dateSent +
                ", status=" + status +
                ", type=" + type +
                ", sender=" + sender.getClass().getSimpleName() +
                '}';
    }
}
