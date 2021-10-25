package adapter.iterator;

import java.util.*;

public class EnumerationIteratorTestDrive {
    public static void main (String args[]) {
        Vector v = new Vector(Arrays.asList(args));
        v.add("Enum 1");
        v.add("Enum 2");
        v.add("Enum 3");
        Iterator iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
