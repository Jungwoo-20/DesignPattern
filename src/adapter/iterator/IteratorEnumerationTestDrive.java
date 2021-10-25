package adapter.iterator;

import java.util.*;

public class IteratorEnumerationTestDrive {
    public static void main (String args[]) {
        ArrayList l = new ArrayList(Arrays.asList(args));
        l.add("Iterator 1");
        l.add("Iterator 2");
        l.add("Iterator 3");
        Enumeration enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
