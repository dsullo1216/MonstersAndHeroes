import java.io.IOException;

public class MarketCell extends AccessibleCell {

    private Inventory stock;

    public MarketCell(int[] position) throws IOException {
        super('M', position);
        type = "Market";
        stock = new Inventory(15);
        stock.randomizeInventory();
    }

    public Inventory getStock() {
        return stock;
    }

}