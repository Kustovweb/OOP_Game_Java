package units;

import java.util.Random;

public class Farmer extends BaseHero{
    public Farmer(String name, int x, int y, int nT) {
        super(name, 10, 0, 1, 0, new Random().nextInt(1, 4), x, y, nT);
    }


}
