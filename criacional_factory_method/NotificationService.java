public class NotificationService {

    private final NotificationFactory factory;

    public NotificationService(NotificationFactory factory) {
        if (factory == null) {
            throw new IllegalArgumentException("A factory não pode ser nula");
        }
        this.factory = factory;
    }

    public void enviar(String message) {
        if (message == null || message.trim().isEmpty()) {
            throw new IllegalArgumentException("A mensagem não pode ser vazia");
        }
        Notification notification = factory.createNotification();
        notification.send(message);
    }
}
