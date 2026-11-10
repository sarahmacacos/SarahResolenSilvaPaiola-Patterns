public class Main {
    public static void main(String[] args) {
        Notifier n1 = new EmailNotifier();
        n1.send("Olá");

        System.out.println();
        Notifier n2 = new SlackDecorator(new EmailNotifier());
        n2.send("Promoção");

        System.out.println();
        Notifier n3 = new SlackDecorator(new SmsDecorator(new EmailNotifier()));
        n3.send("Sistema fora");
    }
}
