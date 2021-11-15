package iterator.directory;

public class File extends Node {
    private String file;
    public File(String file) {
        this.file = file;
    }

    @Override
    public void add(Node node) {

    }

    public String getFile(){
        return file;
    }
    public void print() {
        System.out.println("----------" + getFile());
    }

    @Override
    public void remove(Node node) {

    }

    @Override
    public Node getChild(int i) {
        return null;
    }

}
