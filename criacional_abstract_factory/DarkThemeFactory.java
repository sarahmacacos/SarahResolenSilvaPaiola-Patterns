public class DarkThemeFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
