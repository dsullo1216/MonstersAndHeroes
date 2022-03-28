import java.util.Scanner;

public abstract class Game {
 
    protected Map map;

    public abstract void launchGame(Scanner sc);

    public abstract void processInput(Scanner sc);

    public abstract void playGame(Scanner sc);

}