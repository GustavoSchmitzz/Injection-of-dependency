package com.schmitz.projetodeferias.controller;

public class SMSNotification implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.printf("you recive a SMS: %s",message);
    }
}
