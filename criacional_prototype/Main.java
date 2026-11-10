public class Main {
    public static void main(String[] args) {
        Personagem base = new Personagem("Guerreiro Base", "Guerreiro", 1, 100, 15);

        Personagem luan = base.clone();
        luan.setNome("Luan");

        Personagem luana = base.clone();
        luana.setNome("Luana");

        Personagem sarah = base.clone();
        sarah.setNome("Sarah");

        System.out.println("Personagem Base");
        base.exibir();

        System.out.println();
        System.out.println("Personagens Clonados");
        luan.exibir();
        luana.exibir();
        sarah.exibir();
    }
}
