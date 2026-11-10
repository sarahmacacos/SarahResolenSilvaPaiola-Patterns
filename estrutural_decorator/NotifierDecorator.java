public abstract class NotifierDecorator implements Notifier {
    protected final Notifier wrappee;
    public NotifierDecorator(Notifier wrappee) {
        if (wrappee == null) {
            throw new IllegalArgumentException("O notifier encapsulado não pode ser nulo");
        }
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}
