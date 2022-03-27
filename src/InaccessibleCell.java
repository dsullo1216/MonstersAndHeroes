public class InaccessibleCell extends Cell {
    
    public InaccessibleCell(int[] position) {
        super('X', false, position);
        type = "Inaccessible";
    }

}