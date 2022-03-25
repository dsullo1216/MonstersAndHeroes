public class Inventory {
    
    private Item[] inventory;

    public Inventory(int length) {
        this.inventory = new Item[length];
    }

    public boolean addItem(Item item) {
        int i = 0;
        while (inventory[i] != null && i < inventory.length)  {
            i++;
        }
        if (i >= inventory.length) {
            return false;
        }
        inventory[i] = item;
        return true;
    }

    public boolean removeItem(Item item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == item) {
                inventory[i] = null;
                return true;
            }
        }
        return false;
    }

    public int findItem(Item item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public Item getItemAt(int index) {
        return inventory[index];
    }

}