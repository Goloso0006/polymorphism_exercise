package com.notificationsystem.sender.impl;

import com.notificationsystem.sender.NotificationSender;

public class SmsNotification implements NotificationSender {
    @Override
    public void send() {
        System.out.println("Sending notification by SMS");
    }
}
