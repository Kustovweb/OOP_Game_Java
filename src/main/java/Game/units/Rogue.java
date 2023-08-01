package Game.units;

import java.util.Random;

public class Rogue extends Game.units.InfantryCharacter {

    public Rogue(String name, int x, int y, int nT) {
        super(name, 30, new int[]{4,6}, 7, 2, x, y, nT, 5);
    }


}
