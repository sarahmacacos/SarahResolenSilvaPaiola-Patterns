public class Computador {
    private final String processador;
    private final String memoriaRam;
    private final String armazenamento;
    private final String placaDeVideo;
    private final String sistemaOperacional;

    Computador(String processador, String memoriaRam, String armazenamento,
               String placaDeVideo, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getProcessador() {
        return processador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void exibir() {
        System.out.println("Processador: " + processador);
        System.out.println("RAM: " + memoriaRam);
        System.out.println("Armazenamento: " + armazenamento);
        System.out.println("Placa de vídeo: " + (placaDeVideo == null ? "N/A" : placaDeVideo));
        System.out.println("Sistema operacional: " + (sistemaOperacional == null ? "N/A" : sistemaOperacional));
    }
}
