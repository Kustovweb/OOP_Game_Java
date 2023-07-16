package units;

import java.util.ArrayList;
import java.util.Random;

public class Peasant extends BaseHero{
    public Peasant(String name, int x, int y, int nT) {
        super(name, 10, 0, 1, 0, new Random().nextInt(1, 4), x, y, nT);
    }



}
