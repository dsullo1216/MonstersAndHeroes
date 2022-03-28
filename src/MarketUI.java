import java.io.IOException;
import java.util.Scanner;

public class MarketUI extends UserInterface {

    Inventory stock;

    public MarketUI(HeroSquad party, MarketCell mCell) {
        this.party = party;
        stock = mCell.getStock();
    }

    public int chooseAction(Scanner sc) {
        System.out.println("Please choose an option from the list below to use the shop");
        System.out.println("0. Buy an Item \n 1. Sell an Item");
        System.out.print("Please make a choice: ");
        char actionChoice = sc.next().charAt(0);
        while (Integer.valueOf(actionChoice) < 0 && Integer.valueOf(actionChoice) > 1) {
            System.out.print("Invalid input please try again: ");
            actionChoice = sc.next().charAt(0);
        }
        return Character.getNumericValue(actionChoice);
    }

    public boolean buyItem(Scanner sc) {
        System.out.println("Welcome to the merchant where you can purchase items. Below is the name and type of every item we have in stock. Enter the number next to the item to get more information");
        System.out.println("No / Name / Type");
        for (int i = 0; i < stock.size() ; i++) {
            if (stock.getItemAt(i) != null) {
                System.out.println(i + ". / " + stock.getItemAt(i).getName() + " / " + stock.getItemAt(i).getType());
            }
        }
        boolean purchased = false;
        while (!purchased) {
            System.out.print("Please choose an item to view more information: ");
            String indexToDisplay = sc.next();
            while (Integer.valueOf(indexToDisplay) < 0 && Integer.valueOf(indexToDisplay) >= stock.size()) {
                System.out.print("Invalid input please try again: ");
                indexToDisplay = sc.next();
            }
            Item itemToDisplay = stock.getItemAt(Integer.valueOf(indexToDisplay));
            System.out.println("The stats for the item you chose can be found below");
            System.out.println(itemToDisplay.description());
            System.out.println(itemToDisplay + "\n");
            System.out.print("Would you like to purchase this item? (Y/N): ");
            char purchaseChoice = sc.next().charAt(0);
            while (purchaseChoice != 'Y' && purchaseChoice != 'N') {
                System.out.print("Invalid input. Please enter either 'Y' or 'N' to purchase or not: ");
                purchaseChoice = sc.next().charAt(0);
            }
            if (purchaseChoice == 'N') {
                System.out.println("You chose not to purchase this item. Please view the list above and chose again.");
            }
            else {
                Hero buyer = chooseHero(sc);
                if (buyer.getLevel() < itemToDisplay.getMinLevel()) {
                    System.out.println("You are not a high enough level to purchase this item. Please level up and then come buy this item.");
                    return purchased;
                }
                if (buyer.getWallet() < itemToDisplay.getPrice()) {
                    System.out.println("You do not have sufficient funds to purchase this item. Please gain some more money and then come buy this item.");
                    return purchased;
                }
                if (buyer.getInventory().isFull()) {
                    System.out.println("You do not have enough room in your inventory to purchase this item. Please sell some items first and then come buy this item.");
                    return purchased;
                }
                System.out.println("You successfully purchased " + itemToDisplay.getName() + "\n");
                buyer.updateWallet(buyer.getWallet() - itemToDisplay.getPrice());
                buyer.getInventory().addItem(itemToDisplay);
                stock.removeItem(itemToDisplay);
                purchased = true;
            }
        }
        return purchased;
    }

    public boolean sellItem(Scanner sc) {
        return false;
    }

    public void shopOperations(Scanner sc) {
        int actionChoice = chooseAction(sc);
        switch (actionChoice) {
            case (0): {
                buyItem(sc);
                break;
            }
            case (1): {
                // TODO SELL ITEM
                break;
            }
            default: {
                break;
            }
        }
    }

    @Override
    public void launchInterface(Scanner sc) throws IOException {
        System.out.println("Welcome to the market. Here you can either buy items from the merchant or sell your items for 50% of their value.");
        buyItem(sc);

        
    }
    
}
