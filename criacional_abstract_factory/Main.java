public class Main {
    public static void main(String[] args) {
        System.out.println("=== Tema Claro ===");
        Application claro = new Application(new LightThemeFactory());
        claro.criarInterface();

        System.out.println();
        System.out.println("=== Tema Escuro ===");
        Application escuro = new Application(new DarkThemeFactory());
        escuro.criarInterface();
    }
}
