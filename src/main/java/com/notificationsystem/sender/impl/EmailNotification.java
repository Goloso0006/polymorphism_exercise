package com.notificationsystem.sender.impl;

import com.notificationsystem.sender.NotificationSender;

public class EmailNotification implements NotificationSender {
    @Override
    public void send() {
        System.out.println("Sending notification by EMAIL");
    }
}
