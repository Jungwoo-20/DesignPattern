package iterator.menuitem;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem object = items.get(position);
        position = position + 1;
        return object;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}
