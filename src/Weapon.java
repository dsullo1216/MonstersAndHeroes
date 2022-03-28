public class Weapon extends Item {
    
    public static final String DESCRIPTION = "Weapon Name / Price / Level Required / Damage";
    protected int damage;

    public Weapon(String name, int price, int minLevel, int damage) {
        this.name = name;
        this.price = price;
        this.minLevel = minLevel;
        this.damage = damage;
    }

    public String toString() {
        return name + " / " + Integer.toString(price) + " / " + Integer.toString(minLevel) + " / " + Integer.toString(damage);
    }

    @Override
    public boolean equals(Object other) {

        if (other == this) {
            return true;
        }

        if (!(other instanceof Weapon)) {
            return false;
        }
        
        Weapon otherW = (Weapon) other;
        return (this.name == otherW.getName());
    
    }

    public int getDamage() {
        return damage;
    }

}