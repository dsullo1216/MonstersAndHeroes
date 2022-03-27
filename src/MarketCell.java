public class MarketCell extends AccessibleCell {

    private Inventory stock;

    public MarketCell(int[] position) {
        super('M', position);
        stock = new Inventory(5);
    }

    public Inventory getStock() {
        return stock;
    }

}