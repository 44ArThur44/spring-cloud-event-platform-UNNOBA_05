package ar.edu.unnoba.pdyc2026.notificationservice.dto;

public class NotificationMessage {
    private String origin;
    private String message;

    public NotificationMessage() {}

    public NotificationMessage(String origin, String message) {
        this.origin = origin;
        this.message = message;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
