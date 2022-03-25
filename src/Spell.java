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

    @Override
    public boolean equals(Object other) {

        if (other == this) {
            return true;
        }

        if (!(other instanceof Spell)) {
            return false;
        }
        
        Spell otherS = (Spell) other;
        return ((this.name == otherS.getName()) && 
                (this.price == otherS.getPrice()) && 
                (this.minLevel == otherS.getMinLevel()) && 
                (this.damage == otherS.getDamage()) && 
                (this.type == otherS.getType()) && 
                (this.mana == otherS.getMana()) && 
                (this.reducedStat == otherS.getReducedStat()));
    
    }

    public String inventoryHeader() {
        return "Spell Name / Price / Level Required / Mana Required / Stat Reduced";
    }

    public String getType() {
        return type;
    }

    public int getMana() {
        return mana;
    }

    public String getReducedStat() {
        return reducedStat;
    }
    
}