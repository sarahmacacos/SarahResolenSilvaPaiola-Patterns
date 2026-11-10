import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> filhos = new ArrayList<>();
    public Directory(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        if (name.contains("/") || name.contains("\\") || name.equals("..") || name.equals(".")) {
            throw new IllegalArgumentException("Nome inválido: " + name);
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        long total = 0;
        for (FileSystemComponent filho : filhos) {
            total = Math.addExact(total, filho.getSize());
        }
        return total;
    }

    @Override
    public void display(String indentation) {
        System.out.println(indentation + name + "/");

        String base = "";
        if (!indentation.isEmpty()) {
            String semConector = indentation.substring(0, indentation.length() - 3);
            if (indentation.endsWith("└─ ")) {
                base = semConector + "   ";
            } else {
                base = semConector + "│  ";
            }
        }

        for (int i = 0; i < filhos.size(); i++) {
            if (i == filhos.size() - 1) {
                filhos.get(i).display(base + "└─ ");
            } else {
                filhos.get(i).display(base + "├─ ");
            }
        }
    }

    @Override
    public void add(FileSystemComponent component) {
        if (component == null) {
            throw new IllegalArgumentException("Componente nulo");
        }
        if (component == this) {
            throw new IllegalArgumentException("Uma pasta não pode conter ela mesma");
        }
        if (component instanceof Directory && ((Directory) component).temDentro(this)) {
            throw new IllegalArgumentException("Isso criaria um ciclo na estrutura");
        }
        for (FileSystemComponent filho : filhos) {
            if (filho.getName().equals(component.getName())) {
                throw new IllegalArgumentException("Já existe '" + component.getName() + "' em '" + name + "'");
            }
        }
        filhos.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        if (!filhos.remove(component)) {
            throw new IllegalArgumentException("Esse componente não está em '" + name + "'");
        }
    }

    private boolean temDentro(FileSystemComponent procurado) {
        for (FileSystemComponent filho : filhos) {
            if (filho == procurado) {
                return true;
            }
            if (filho instanceof Directory && ((Directory) filho).temDentro(procurado)) {
                return true;
            }
        }
        return false;
    }
}
