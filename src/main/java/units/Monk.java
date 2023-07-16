package units;

import java.util.ArrayList;
import java.util.Random;

public class Monk extends MagicalCharacter{
    public Monk(String name, int x, int y, int nT) {
        super(name, new Random().nextInt(1, 10), x, y, nT);
    }



}
