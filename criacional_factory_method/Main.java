public class Main {
    public static void main(String[] args) {
        String mensagem = "Bem-vindo ao sistema!";

        NotificationService email = new NotificationService(new EmailNotificationFactory());
        NotificationService sms = new NotificationService(new SMSNotificationFactory());
        NotificationService push = new NotificationService(new PushNotificationFactory());

        email.enviar(mensagem);
        sms.enviar(mensagem);
        push.enviar(mensagem);
    }
}
