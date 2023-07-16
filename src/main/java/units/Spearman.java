package units;

import java.util.ArrayList;
import java.util.Random;

public class Spearman extends InfantryCharacter{
    public Spearman(String name, int x, int y, int nT) {

        super(name, new Random().nextInt(1, 6), x, y, nT);
    }


}
