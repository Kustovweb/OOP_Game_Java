package units;

import java.util.ArrayList;
import java.util.Random;

public class Crossbowman extends ShooterCharacter {
    public Crossbowman(String name, int x, int y, int nT) {

        super(name, new Random().nextInt(1, 8), x, y, nT);
    }

    @Override
    public void step(ArrayList<BaseHero> enemy) {

    }
}
