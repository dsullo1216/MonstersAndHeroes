import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        /*Inventory test = new Inventory(5);
        test.addItem(new Weapon("name", 10, 10, 10));
        Item testI = test.getItemAt(0);
        Weapon testII = new Weapon("name", 10, 10, 10);
        System.out.println(testII.equals(testI));
        Map mapt = new Map();
        mapt.printMap();
        System.out.println();
        System.out.print(mapt.moveSquad(new int[] {0,1}));
        mapt.printMap();
        Hero[] test4 = ReadFiles.ListOfHeroes();
        System.out.println(Hero.DESCRIPTION);
        for (int i = 0; i < test4.length; i++) {
            System.out.print(i + ". ");
            System.out.println(test4[i]);
        }*/
        Game test1 = new HeroesAndMonstersGame();
        Scanner sc = new Scanner(System.in);
        test1.playGame(sc);
        MarketCell test = new MarketCell(new int[] {0,0});
        Inventory testInv = test.getStock();
        for (int i = 0; i < testInv.size(); i++) {
            System.out.println(testInv.getItemAt(i));
        }
        }
}
