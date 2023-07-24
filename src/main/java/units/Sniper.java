package units;

import java.util.ArrayList;
import java.util.Random;

public class Sniper extends ShooterCharacter {
    public Sniper(String name, int x, int y, int nT) {

        super(name, 10, 0, 4, new int[] {5, 5}, 6, new Random().nextInt(1, 5), x, y, nT);

    }



}
