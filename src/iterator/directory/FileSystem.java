package iterator.directory;

public class FileSystem {
    private Node allDirecFile;

    public FileSystem(Node allDirecFile) {
        this.allDirecFile = allDirecFile;
    }

    public void print() {
        allDirecFile.print();
    }
}
