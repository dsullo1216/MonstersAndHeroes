public class Spell extends Weapon {

    protected String type;
    protected int mana;
    protected String reducedStat;

    public Spell(String name, int price, int minLevel, int damage, int mana, String reducedStat) {
        super(name, price, minLevel, damage);
        this.mana = mana;
        this.reducedStat = reducedStat;
    }

    public String toString() {
        return name + " / " + Integer.toString(price) + " / " + Integer.toString(minLevel) + " / " + Integer.toString(damage) + " / " +Integer.toString(mana) + " / " + reducedStat;
    }

    public String inventoryHeader() {
        return "Spell Name / Price / Level Required / Mana Required / Stat Reduced";
    }

    public int getMana() {
        return mana;
    }

    public String getReducedStat() {
        return reducedStat;
    }
    
}