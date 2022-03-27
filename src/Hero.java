public class Hero extends Entity {

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

    @Override
    public boolean equals(Object other) {

        if (other == this) {
            return true;
        }

        if (!(other instanceof Hero)) {
            return false;
        }
        
        Hero otherH = (Hero) other;
        return ((this.name == otherH.getName()) && 
                (this.mana == otherH.getMana()) && 
                (this.strength == otherH.getStrength()) && 
                (this.agility == otherH.getAgility()) &&
                (this.dexterity == otherH.getDexterity()) && 
                (this.type == otherH.getType()));

    }

    public String description() {
        return "Type    /   Name    /   Level    /   HP    /   Mana    /   Defense    /   Strength    /   Agility    /   Dexterity    /   Wallet";
    }

    public String getType() {
        return type;
    }

    public int getMana() {
        return mana;
    }

    public int updateMana(int newMana) {
        this.mana = newMana;
        return newMana;
    }

    public int getStrength() {
        return strength;
    }

    public int updateStrength(int newStrength) {
        this.strength = newStrength;
        return newStrength;
    }

    public int getAgility() {
        return agility;
    }

    public int updateAgility(int newAgility) {
        this.agility = newAgility;
        return newAgility;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int updateDexterity(int newDexterity) {
        this.dexterity = newDexterity;
        return newDexterity;
    }

    public int getWallet() {
        return wallet;
    }

    public int updateWallet(int newWallet) {
        this.wallet = newWallet;
        return newWallet;
    }

    public void levelUp() {
        this.level += 1;
        this.exp = 0;
        this.hp = level * 100;
        this.mana *= 1.1;
        this.strength *= 1.05;
        this.agility *= 1.05;
        this.dexterity *= 1.05;
    }

}