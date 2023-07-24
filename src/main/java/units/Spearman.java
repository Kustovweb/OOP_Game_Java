package units;

import java.util.ArrayList;
import java.util.Random;

public class Spearman extends InfantryCharacter{
    public Spearman(String name, int x, int y, int nT) {

        super(name, 20, 0, 7, new int[]{3, 4},8, new Random().nextInt(1, 6), x, y, nT);
    }

}
