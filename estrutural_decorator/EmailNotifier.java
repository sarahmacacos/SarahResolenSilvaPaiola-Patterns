public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        if (message == null) {
            throw new IllegalArgumentException("A mensagem não pode ser nula");
        }
        System.out.println("Enviando EMAIL: " + message);
    }
}
