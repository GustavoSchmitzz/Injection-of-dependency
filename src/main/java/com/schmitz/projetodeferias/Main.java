package com.schmitz.projetodeferias;

import com.schmitz.projetodeferias.controller.EmailNotification;
import com.schmitz.projetodeferias.controller.NotificationSender;
import com.schmitz.projetodeferias.controller.SMSNotification;
import com.schmitz.projetodeferias.service.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationSender sms = new SMSNotification();
        NotificationSender email = new EmailNotification();

        NotificationService sender1 = new NotificationService(email);
        NotificationService sender2 = new NotificationService(sms);

        sender1.processarEnvio("teste 1");
        sender2.processarEnvio("teste 2");
    }
}
