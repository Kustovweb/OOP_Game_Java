package units;

import java.util.ArrayList;
import java.util.Random;

public class Crossbowman extends ShooterCharacter {
    public Crossbowman(String name, int x, int y, int nT) {

        super(name, 15, 0, 5, new int[]{1, 4}, 6,  new Random().nextInt(1, 8), x, y, nT);
    }

}
