public class Application {
    private static final Logger lightThemeFactory = null;
    private final Logger logger;
    public Application(LightThemeFactory logger) {
        if (logger == null) {
            throw new IllegalArgumentException("O logger não pode ser nulo");
        }
        this.logger = lightThemeFactory;
    }

    public Application(DarkThemeFactory darkThemeFactory) {
        this.logger = null;
        //TODO Auto-generated constructor stub
    }

    public Application(Logger logger2) {
        this.logger = null;
        //TODO Auto-generated constructor stub
    }

    public void run() {
        logger.info("Iniciando aplicação");
        logger.error("Falha ao conectar no banco");
    }

    public void criarInterface() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarInterface'");
    }
}
