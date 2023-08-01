package Game.units;

import Game.units.ShooterCharacter;

import java.util.Random;

public class Crossbowman extends ShooterCharacter {
    public Crossbowman(String name, int x, int y, int nT) {

        super(name, 20, new int[]{12,5},  5, 2,5, 2, x, y, nT, 5);
    }

}
