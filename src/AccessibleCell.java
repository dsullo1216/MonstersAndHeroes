public abstract class AccessibleCell extends Cell {

    protected boolean isHeroSquadHere;
    
    protected AccessibleCell(char symbol, int[] position) {
        super(symbol, true, position);
        this.isHeroSquadHere = false;
    }

    @Override
    public char getSymbol() {
        if (isHeroSquadHere == true) {
            return 'H';
        }
        return symbol;
    }

    /* TODO ADD Trigger_Event Interface and each respective event to each tile */
 
}