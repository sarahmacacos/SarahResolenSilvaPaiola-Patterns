public class LightThemeFactory implements UIComponentFactory {

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
