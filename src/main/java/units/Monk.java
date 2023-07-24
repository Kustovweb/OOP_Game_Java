package units;

import java.util.ArrayList;
import java.util.Random;

public class Monk extends MagicalCharacter{
    public Monk(String name, int x, int y, int nT) {
        super(name, 10, 5, 4, new int[] {-5, -5}, 5, new Random().nextInt(1, 10), x, y, nT);
    }

}
