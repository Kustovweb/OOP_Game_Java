package Game.units;

import java.util.Random;

public class Spearman extends Game.units.InfantryCharacter {
    public Spearman(String name, int x, int y, int nT) {

        super(name, 17, new int[]{2,6}, 5, 2, x, y, nT, 4);
    }

}
