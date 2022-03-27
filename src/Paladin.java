public class Paladin extends Hero {
    
    public Paladin(String name, int mana, int strength, int agility, int dexterity, int wallet, int level) {
        super(name, mana, strength, agility, dexterity, wallet, level);
        this.type = "Paladin";
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.strength *= 1.05;
        this.dexterity *= 1.05;
    }

}