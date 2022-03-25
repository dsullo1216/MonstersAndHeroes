public class Weapon extends Item {
    
    private int damage;

    public Weapon(String name, int price, int minLevel, int damage) {
        this.name = name;
        this.price = price;
        this.minLevel = minLevel;
        this.damage = damage;
    }

    public String toString() {
        return "Weapon Name / Price / Level Required / Damage" + '\n' + name + " / " + Integer.toString(price) + " / " + Integer.toString(minLevel) + " / " + Integer.toString(damage);
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getMinLevel() {
        return this.minLevel;
    }

    public int getDamage() {
        return this.damage;
    }
}