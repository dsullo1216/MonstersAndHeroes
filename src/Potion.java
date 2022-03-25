public class Potion extends Item {

    private int buffAmt;
    private String buffedStat;

    public Potion(String name, int price, int minLevel, int buffAmt, String buffedStat) {
        this.name = name;
        this.price = price;
        this.minLevel = minLevel;
        this.buffAmt = buffAmt;
        this.buffedStat = buffedStat;
    }

    public String toString() {
        return name + " / " + Integer.toString(price) + " / " + Integer.toString(minLevel) + " / " + Integer.toString(buffAmt) + " / " + buffedStat;
    }

    public String inventoryHeader() {
        return "Potion Name / Price / Level Required / Buff Amount / Stat Buffed";
    }

    public int getBuffAmt() {
        return buffAmt;
    }

    public String getBuffedStat() {
        return buffedStat;
    }

}