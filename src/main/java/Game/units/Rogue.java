package Game.units;

import java.util.Random;

public class Rogue extends Game.units.InfantryCharacter {

    public Rogue(String name, int x, int y, int nT) {
        super(name, 10, new int[]{2,4}, 5, x, y, nT, 7);
    }


}
