package units;

import java.util.ArrayList;
import java.util.Random;

public class Sniper extends ShooterCharacter {
    public Sniper(String name, int x, int y, int nT) {

        super(name, new Random().nextInt(1, 5), x, y, nT);

    }



}
