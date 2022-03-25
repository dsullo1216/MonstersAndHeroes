public class Main {
    
    public static void main(String[] args) {
        Inventory test = new Inventory(5);
        test.addItem(new Weapon("name", 10, 10, 10));
        Item testI = test.getItemAt(0);
        System.out.println(testI.inventoryHeader());
    }
}
