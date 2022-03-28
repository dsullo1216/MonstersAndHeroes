public class Main {
    
    public static void main(String[] args) {
        Inventory test = new Inventory(5);
        test.addItem(new Weapon("name", 10, 10, 10));
        Item testI = test.getItemAt(0);
        Weapon testII = new Weapon("name", 10, 10, 10);
        System.out.println(testII.equals(testI));
        Map mapt = new Map();
        mapt.printMap();
        System.out.println();
        System.out.print(mapt.moveSquad(new int[] {0,1}));
        mapt.printMap();
    }
}
