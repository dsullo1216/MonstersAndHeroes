public abstract class Entity {
    
    protected String name;
    protected int level;
    protected int hp;

    public abstract String toString();

    public abstract boolean attack(Entity other);

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHP() {
        return hp;
    }

    public int updateHP(int newHP) {
        this.hp = newHP;
        return newHP;
    }

}