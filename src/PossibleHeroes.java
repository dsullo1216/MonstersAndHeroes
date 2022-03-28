import java.io.IOException;

public class PossibleHeroes {

    public static Hero[] getListOfHeroes() throws IOException {
        String[] WarriorArr = TSVReader.readTSVFile("./src/data/Warriors.tsv");
        String[] SorcererArr = TSVReader.readTSVFile("./src/data/Sorcerers.tsv");
        String[] PaladinArr = TSVReader.readTSVFile("./src/data/Paladins.tsv");
        String[] result = new String[WarriorArr.length + SorcererArr.length + PaladinArr.length - 3];
        int resultIndex = 0;
        for (int i = 1; i < WarriorArr.length; i++) {
            result[resultIndex] = WarriorArr[i];
            resultIndex++;
        }
        for (int i = 1; i < SorcererArr.length; i++) {
            result[resultIndex] = SorcererArr[i];
            resultIndex++;
        }
        for (int i = 1; i < PaladinArr.length; i++) {
            result[resultIndex] = PaladinArr[i];
            resultIndex++;
        }
        Hero[] heroArr = new Hero[result.length];
        for (int i = 0; i < heroArr.length; i++) {
            String[] splitRow = result[i].split("\t");
            System.out.println(result[i]);
            /*for (String inner: splitRow) {
                System.out.println(inner);
            }*/
            heroArr[i] = new Hero(splitRow[0], Integer.valueOf(splitRow[1]), Integer.valueOf(splitRow[2]), Integer.valueOf(splitRow[3]), Integer.valueOf(splitRow[4]), Integer.valueOf(splitRow[5]), Integer.valueOf(splitRow[6]));
        }
        return heroArr;
    }
    
}