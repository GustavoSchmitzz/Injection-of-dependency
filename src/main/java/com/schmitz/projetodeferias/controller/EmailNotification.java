package com.schmitz.projetodeferias.controller;

public class EmailNotification implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.printf("you recive an email: %s",message);
    }
}
