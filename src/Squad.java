public class Squad {
    
    protected Entity[] party;

    public Squad(int size) {
        party = new Entity[size];
    }

    public String toString() {
        String result = party[0].type + ": " + '\n' + "No / " + party[0].description() + '\n';;
        for (int i = 0; i < party.length; i++) {
            result += Integer.toString(i+1) + "." + party[0].toString() + '\n';
        }
        return result;
    }

    public boolean addEntity(Entity newEntity) {
        int i = 0;
        while (party[i] != null && i < party.length) {
            i++;
        }
        if (i >= party.length) {
            return false;
        }
        party[i] = newEntity;
        return true;
    }

    public boolean removeEntity(Entity entity) {
        for (int i = 0; i < party.length; i++) {
            if (party[i].equals(entity)) {
                party[i] = null;
                return true;
            }
        }
        return false;
    }

    public int findEntity(Entity entity) {
        for (int i = 0; i < party.length; i++) {
            if (party[i].equals(entity)) {
                return i;
            }
        }
        return -1;
    }

    public Entity getEntityAt(int index) {
        return party[index];
    }

}