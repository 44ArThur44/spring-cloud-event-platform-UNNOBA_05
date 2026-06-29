package ar.edu.unnoba.pdyc2026.notificationservice.controller;

import ar.edu.unnoba.pdyc2026.notificationservice.dto.NotificationMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @GetMapping
    public List<NotificationMessage> getNotifications() {
        return List.of(new NotificationMessage("system", "Notificação de exemplo"));
    }
}
