public class Monster extends Entity {
    
    protected String type;
    protected int damage;
    protected int defense;
    protected int dodgeChance;

    public Monster(String name, int level, int damage, int defense, int dodgeChance) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.defense = defense;
        this.dodgeChance = dodgeChance;
        this.hp = level * 100;
    }

    public String toString() {
        return type + " / " + 
               name + " / " + 
               Integer.toString(level) + " / " + 
               Integer.toString(hp) + " / " + 
               Integer.toString(damage) + " / " + 
               Integer.toString(defense) + " / " +
               Integer.toString(dodgeChance);
    }

    public String description() {
        return "Type    /   Name    /   Level    /   HP    /   Damage    /   Defense    /   Dodge Chance";
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public int getDodgeChance() {
        return dodgeChance;
    }

}