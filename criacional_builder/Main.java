public class Main {

    public static void main(String[] args) {
        Computador basico = new ComputadorBuilder()
                .processador("Intel Core i5")
                .memoriaRam("8GB")
                .armazenamento("256GB SSD")
                .build();

        Computador gamer = new ComputadorBuilder()
                .processador("Intel Core i9")
                .memoriaRam("32GB")
                .armazenamento("1TB SSD")
                .placaDeVideo("NVIDIA RTX 4070")
                .build();

        System.out.println("=== Computador Básico ===");
        basico.exibir();
        
        System.out.println();
        System.out.println("=== Computador Gamer ===");
        gamer.exibir();
    }
}
