package iterator.directory;

import java.util.*;

public class Directory extends Node {
    private ArrayList<Node> directoryComponents = new ArrayList<Node>();
    private String file;
    public Directory(String file) {
        this.file = file;
    }

    public void add(Node node) {
        directoryComponents.add(node);
    }

    public void remove(Node node) {
        directoryComponents.remove(node);
    }

    public Node getChild(int i) {
        return (Node) directoryComponents.get(i);
    }

    public String getFile() {
        return file;
    }
    public void print() {
        System.out.println(getFile());
        Iterator iterator = directoryComponents.iterator();
        while (iterator.hasNext()) {
            Node node = (Node) iterator.next();
            node.print();
        }
    }
}
