import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Game test1 = new HeroesAndMonstersGame();
        Scanner sc = new Scanner(System.in);
        test1.playGame(sc);
        // TODO FIGURE OUT WHY READING TSV FILES ISNT WORKING
    }
}