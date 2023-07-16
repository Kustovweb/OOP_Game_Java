package units;

import java.util.ArrayList;
import java.util.Random;

public class Rogue extends InfantryCharacter{

    public Rogue(String name, int x, int y, int nT) {
        super(name, new Random().nextInt(1, 12), x, y, nT);
    }



}
