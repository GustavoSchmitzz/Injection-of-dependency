package com.schmitz.projetodeferias.service;

import com.schmitz.projetodeferias.controller.NotificationSender;

public class NotificationService {
    private final NotificationSender sender;

    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    public void processarEnvio(String texto) {
        if (sender != null) {
            sender.send(texto);
        }
    }
}
