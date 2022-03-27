public class BattleCell extends AccessibleCell {
    
    private static final double BATTLERATE = 0.125;

    public BattleCell(int[] position) {
        super('_', position);
        type = "Battle";
    }

    public double getBattleRate() {
        return BATTLERATE;
    }

}