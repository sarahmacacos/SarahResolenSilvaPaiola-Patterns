public class File implements FileSystemComponent {

    private final String name;
    private final long size;
    public File(String name, long size) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        if (name.contains("/") || name.contains("\\") || name.equals("..") || name.equals(".")) {
            throw new IllegalArgumentException("Nome inválido: " + name);
        }
        if (size < 0) {
            throw new IllegalArgumentException("O tamanho não pode ser negativo");
        }
        this.name = name;
        this.size = size;
    }

    public static String emMb(long bytes) {
        double mb = bytes / 1024.0 / 1024.0;
        return String.format(java.util.Locale.US, "%.1f MB", mb);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void display(String indentation) {
        System.out.println(indentation + name + " (" + emMb(size) + ")");
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Arquivo não pode ter componentes");
    }

    @Override
    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Arquivo não tem componentes");
    }
}
