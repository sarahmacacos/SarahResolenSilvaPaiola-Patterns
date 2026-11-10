public class Main {
    public static void main(String[] args) {
        LegacyLogger legacy = new LegacyLogger();
        Logger logger = new LegacyLoggerAdapter(legacy);
        Application app = new Application(logger);
        app.run();
    }
}
