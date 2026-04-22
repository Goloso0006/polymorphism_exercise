package com.notificationsystem.app;

import com.notificationsystem.model.Notification;
import com.notificationsystem.model.TypeNotification;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification(
                "student@ucc.edu.co",
                "Your grade has been published",
                TypeNotification.GRADES_PUBLICATION,
                null
        );

        notification.sendNotification();

        System.out.println(notification);
    }
}
