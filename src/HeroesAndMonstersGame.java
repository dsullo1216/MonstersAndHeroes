import java.io.IOException;
import java.util.Scanner;

public class HeroesAndMonstersGame extends Game {

    private HeroSquad party;

    public HeroesAndMonstersGame() {
        this.map = new Map();
    }

    public void launchGame(Scanner sc) throws IOException {
        System.out.println("Welcome to Heroes and Monsters");
        System.out.println("How many Heroes would you like to play with? (1-3): ");
        char numHeroes = sc.next().charAt(0);
        while (!"123".contains(numHeroes + "")) {
            System.out.print("Invalid number of Heroes. Please enter a number between 1 and 3: ");
            numHeroes = sc.next().charAt(0);
        }
        party = new HeroSquad(numHeroes);
        System.out.println("Here is the list of heroes and their starting statistics. You make pick " + numHeroes + " unique heroes.");
        System.out.println("Please note that the order in which you pick your heroes will be the order in which they fight in battle");
        System.out.println();
        Hero[] heroList = ReadFiles.ListOfHeroes();
        System.out.println(heroList[0].description());
        for (int i = 0; i < heroList.length; i++) {
            System.out.print(i + ". ");
            System.out.println(heroList[i]);
        }
        party = getHeroIndices(sc, numHeroes, heroList);


    }

    private HeroSquad getHeroIndices(Scanner sc, int numHeroes, Hero[] heroList) {
        System.out.print("Please select each hero by typing in the number next to their name and pressing enter/return until you've selected " + numHeroes + "hero(es): ");
        String currHeroChoice;
        while (!party.isFull()) {
            currHeroChoice = sc.next();
            while (Integer.valueOf(currHeroChoice) < 0 && Integer.valueOf(currHeroChoice) > heroList.length) {
                System.out.println();
                // TODO Finish this method by validating inputs until all heroes are picked
            }


        }
        return party;
    }

    public void processInput(Scanner sc) {
        // TODO Auto-generated method stub
        party.getEntityAt(0);
        
    }


    public void playGame(Scanner sc) {
        // TODO Auto-generated method stub
        
    }
    
}
