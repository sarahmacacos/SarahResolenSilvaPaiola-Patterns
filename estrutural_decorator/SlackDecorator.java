public class SlackDecorator extends NotifierDecorator {
    public SlackDecorator(Notifier wrappee) {
        super(wrappee);
    }
    
    @Override
    public void send(String message) {
        wrappee.send(message);
        System.out.println("Enviando SLACK: " + message);
    }
}
