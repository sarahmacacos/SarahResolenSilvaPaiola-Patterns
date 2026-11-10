public class Main {
    public static void main(String[] args) {
        long mb = 1024 * 1024;

        Directory root = new Directory("root");
        Directory docs = new Directory("docs");
        Directory fotos = new Directory("fotos");
        Directory familia = new Directory("familia");

        docs.add(new File("projeto.pdf", 2 * mb));
        docs.add(new File("relatorio.docx", 1 * mb));

        familia.add(new File("casal.jpg", 2 * mb));
        familia.add(new File("filhos.jpg", 1 * mb));

        fotos.add(new File("vacacao.jpg", 3 * mb));
        fotos.add(familia);

        root.add(docs);
        root.add(fotos);
        root.add(new File("readme.txt", mb / 2));

        root.display("");

        System.out.println();
        System.out.println("Tamanho total: " + File.emMb(root.getSize()));
        System.out.println("Tamanho da pasta 'docs': " + File.emMb(docs.getSize()));
        System.out.println("Tamanho da pasta 'familia': " + File.emMb(familia.getSize()));
    }
}
