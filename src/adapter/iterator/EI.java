package adapter.iterator;

import java.util.*;

public class EI {
    public static void main (String args[]) {
        Vector v = new Vector(Arrays.asList(args));
        v.add("EI 1");
        v.add("EI 2");
        v.add("EI EE3");
        Enumeration enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        Iterator iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
