package Game.units;

import Game.units.ShooterCharacter;

import java.util.Random;

public class Crossbowman extends ShooterCharacter {
    public Crossbowman(String name, int x, int y, int nT) {

        super(name, 10, new int[]{3,5},  5, 2,15, x, y, nT, 3);
    }

}
