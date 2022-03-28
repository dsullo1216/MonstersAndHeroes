import java.io.IOException;
import java.util.Scanner;

public class UserInventoryUI implements UserInterface {

    HeroSquad party;

    public UserInventoryUI(HeroSquad party) {
        this.party = party;
    }

    public Hero chooseHero(Scanner sc) {
        System.out.println("Please select which hero's inventory you would like to manage by entering the number next to their name:");
        for (int i = 0; i < party.size(); i++) {
            System.out.print(i + ". ");
            System.out.println(party.getEntityAt(i));
        }
        System.out.print("Please select your hero: ");
        char heroChoice = sc.next().charAt(0);
        while (Integer.valueOf(heroChoice) < 0 && Integer.valueOf(heroChoice) >= party.size()) {
            System.out.print("The index you chose is out of range for the list of Heroes. Please try again: ");
            heroChoice = sc.next().charAt(0);
        }
        return (Hero) party.getEntityAt(heroChoice);
    }
    
    public int chooseAction(Scanner sc) {
        System.out.println("Please choose an option from the list below to manage your inventory");
        System.out.println("0. Change Weapon \n 1. Change Armor \n 2. Use Potion");
        System.out.print("Please make a choice: ");
        char actionChoice = sc.next().charAt(0);
        while (Integer.valueOf(actionChoice) < 0 && Integer.valueOf(actionChoice) > 2) {
            System.out.print("Invalid input please try again: ");
            actionChoice = sc.next().charAt(0);
        }
        return Character.getNumericValue(actionChoice);
    }

    public void changeWeapon(Scanner sc, Hero currHero) {
        Inventory currInventory = currHero.getInventory();
        Inventory weaponInventory = new Inventory(currInventory.size());
        for (int i = 0; i < currInventory.size(); i++) {
            if (currInventory.getItemAt(i) instanceof Weapon) {
                weaponInventory.addItem(currInventory.getItemAt(i));
            }
        }
        System.out.println("Please choose which sword you would like to equip from the list below. By equiping a sword, your current sword will go back to your inventory.");
        System.out.println(Weapon.DESCRIPTION)

    }

    public void changeArmor(Scanner sc, Hero currHero) {

    }

    public void usePotion(Scanner sc, Hero currHero) {

    }

    public void manageInventory(Scanner sc, Hero currHero) {
      int actionChoice = chooseAction(sc);
      switch (actionChoice) {
          case (0): {
              changeWeapon(sc, currHero);
          }
          case (1): {
              changeArmor(sc, currHero);
          }
          case (2): {
              // TODO LAUNCH POTION MENU
          }
          default: {
              break;
          }
      }
    }

    @Override
    public void launchInterface(Scanner sc) throws IOException {
        // TODO Auto-generated method stub
        System.out.println("Welcome to your inventory. Here you can select a hero and view their items and switch the equipment that you are using.");
        while (true) {
            Hero currHero = chooseHero(sc);
            manageInventory(sc, currHero);
            break;
        }
    }
    
}