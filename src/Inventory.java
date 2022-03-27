public class Inventory {
    
    private Item[] items;

    public Inventory(int length) {
        this.items = new Item[length];
    }

    public boolean addItem(Item item) {
        int i = 0;
        while (items[i] != null && i < items.length)  {
            i++;
        }
        if (i >= items.length) {
            return false;
        }
        items[i] = item;
        return true;
    }

    public boolean removeItem(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == item) {
                items[i] = null;
                return true;
            }
        }
        return false;
    }

    public int findItem(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public Item getItemAt(int index) {
        return items[index];
    }

}