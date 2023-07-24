package units;

import java.util.ArrayList;
import java.util.Random;

public class Rogue extends InfantryCharacter{

    public Rogue(String name, int x, int y, int nT) {
        super(name, 30, 0, 4, new int[]{2, 2},8, new Random().nextInt(1, 12), x, y, nT);
    }


}
