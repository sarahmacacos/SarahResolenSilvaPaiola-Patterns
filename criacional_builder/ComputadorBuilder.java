public class ComputadorBuilder {
    private String processador;
    private String memoriaRam;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;
    public ComputadorBuilder processador(String processador) {
        this.processador = processador;
        return this;
    }

    public ComputadorBuilder memoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
        return this;
    }

    public ComputadorBuilder armazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
        return this;
    }

    public ComputadorBuilder placaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
        return this;
    }

    public ComputadorBuilder sistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
        return this;
    }

    public Computador build() {
        if (processador == null || processador.trim().isEmpty()) {
            throw new IllegalStateException("Falta o processador");
        }
        if (memoriaRam == null || memoriaRam.trim().isEmpty()) {
            throw new IllegalStateException("Falta a memória RAM");
        }
        if (armazenamento == null || armazenamento.trim().isEmpty()) {
            throw new IllegalStateException("Falta o armazenamento");
        }

        String placa = placaDeVideo;
        if (placa != null) {
            placa = placa.trim();
            if (placa.isEmpty()) {
                placa = null;
            }
        }

        String so = sistemaOperacional;
        if (so != null) {
            so = so.trim();
            if (so.isEmpty()) {
                so = null;
            }
        }

        return new Computador(processador.trim(), memoriaRam.trim(), armazenamento.trim(), placa, so);
    }
}
