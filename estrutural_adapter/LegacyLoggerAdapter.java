public class LegacyLoggerAdapter implements Logger {
    private final LegacyLogger legacy;
    public LegacyLoggerAdapter(LegacyLogger legacy) {
        if (legacy == null) {
            throw new IllegalArgumentException("O logger legado não pode ser nulo");
        }
        this.legacy = legacy;
    }

    @Override
    public void info(String message) {
        legacy.log("INFO", limpar(message));
    }

    @Override
    public void error(String message) {
        legacy.log("ERROR", limpar(message));
    }

    private String limpar(String message) {
        if (message == null) {
            throw new IllegalArgumentException("A mensagem não pode ser nula");
        }
        return message.replace("\r", " ").replace("\n", " ");
    }
}
