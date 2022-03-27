public class Hero extends Entity {

    protected String type;
    protected int exp;
    protected int mana;
    protected int strength;
    protected int agility;
    protected int dexterity;
    protected int wallet;
    protected Weapon weapon;
    protected Armor armor;
    protected Inventory inventory;

    public Hero(String name, int mana, int strength, int agility, int dexterity, int wallet, int level) {
        this.name = name;
        this.mana = mana;
        this.strength = strength;
        this.agility = agility;
        this.dexterity = dexterity;
        this.wallet = wallet;
        this.level = level;
        this.hp = level * 100;
        this.exp = 0;
        this.weapon = null;
        this.armor = null;
        this.inventory = new Inventory(10);
    }

    public String toString() {
        return type + " / " + 
               name + " / " + 
               Integer.toString(level) + " / " + 
               Integer.toString(hp) + " / " + 
               Integer.toString(mana) + " / " + 
               Integer.toString(armor.getDefense()) + " / " + 
               Integer.toString(strength) + " / " + 
               Integer.toString(agility) + " / " + 
               Integer.toString(dexterity) + " / " +
               Integer.toString(wallet);
    }

    public String description() {
        return "Type    /   Name    /   Level    /   HP    /   Mana    /   Defense    /   Strength    /   Agility    /   Dexterity    /   Wallet";
    }

    public boolean attack(Entity other) {
        return false;
    }
    
}