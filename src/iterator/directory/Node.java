package iterator.directory;

public abstract class Node {

    public void add(Node node){throw new UnsupportedOperationException();}
    public void print() { throw new UnsupportedOperationException(); }
    public void remove(Node node){throw new UnsupportedOperationException();}
    public Node getChild(int i){throw new UnsupportedOperationException();}
    public String getFile(){throw new UnsupportedOperationException();}
}
