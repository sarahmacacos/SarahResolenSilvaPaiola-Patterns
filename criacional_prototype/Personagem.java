public class Personagem {
    private String nome;
    private final String classe;
    private final int nivel;
    private final int vida;
    private final int ataque;
    public Personagem(String nome, String classe, int nivel, int vida, int ataque) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        if (classe == null || classe.trim().isEmpty()) {
            throw new IllegalArgumentException("A classe não pode ser vazia");
        }
        if (nivel < 1) {
            throw new IllegalArgumentException("O nível mínimo é 1");
        }
        if (vida <= 0) {
            throw new IllegalArgumentException("A vida tem que ser maior que 0");
        }
        if (ataque < 0) {
            throw new IllegalArgumentException("O ataque não pode ser negativo");
        }
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
    }
    @Override
    public Personagem clone() {
        return new Personagem(nome, classe, nivel, vida, ataque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public void exibir() {
        System.out.println("Nome: " + nome + " | Classe: " + classe + " | Nível: " + nivel
                + " | Vida: " + vida + " | Ataque: " + ataque);
    }
}
