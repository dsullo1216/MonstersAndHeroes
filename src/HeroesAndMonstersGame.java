import java.util.Scanner;

public class HeroesAndMonstersGame extends Game {

    private HeroSquad party;

    public HeroesAndMonstersGame() {
        this.map = new Map();
    }

    public void launchGame(Scanner sc) {
        System.out.println("Welcome to Heroes and Monsters");
        System.out.println("How many Heroes would you like to play with? (1-3): ");
        char numHeroes = sc.next().charAt(0);
        while (!"123".contains(numHeroes + "")) {
            System.out.print("Invalid number of Heroes. Please enter a number between 1 and 3: ");
            numHeroes = sc.next().charAt(0);
        }
        party = new HeroSquad(numHeroes);
    }


    public void processInput(Scanner sc) {
        // TODO Auto-generated method stub
        party.getEntityAt(0);
        
    }


    public void playGame(Scanner sc) {
        // TODO Auto-generated method stub
        
    }
    
}
