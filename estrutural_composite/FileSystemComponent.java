public interface FileSystemComponent {

    String getName();
    long getSize();
    void display(String indentation);
    void add(FileSystemComponent component);
    void remove(FileSystemComponent component);
}
