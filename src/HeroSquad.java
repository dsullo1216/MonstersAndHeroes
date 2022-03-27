public class HeroSquad extends Squad {

    private int[] position;

    public HeroSquad(int size) {
        this.party = new Hero[size];
        position = new int[] {0,0};
    }

    public int[] getPosition() {
        return position;
    }

    public int[] updatePosition(int[] newPosition) {
        this.position = newPosition;
        return newPosition;
    }
    
}