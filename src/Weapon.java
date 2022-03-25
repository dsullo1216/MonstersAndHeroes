public class Weapon extends Item {
    
    private int damage;

    public Weapon(String name, int price, int minLevel, int damage) {
        this.name = name;
        this.price = price;
        this.minLevel = minLevel;
        this.damage = damage;
    }

    public String toString() {
        return name + " / " + Integer.toString(price) + " / " + Integer.toString(minLevel) + " / " + Integer.toString(damage);
    }

    public String inventoryHeader() {
        return "Weapon Name / Price / Level Required / Damage";
    }

    public int getDamage() {
        return damage;
    }
    
}