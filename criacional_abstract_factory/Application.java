public class Application {
    private final UIComponentFactory factory;
    public Application(UIComponentFactory factory) {
        if (factory == null) {
            throw new IllegalArgumentException("A factory não pode ser nula");
        }
        this.factory = factory;
    }

    public void criarInterface() {
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        Checkbox checkbox = factory.createCheckbox();
        button.render();
        textField.render();
        checkbox.render();
    }
}
