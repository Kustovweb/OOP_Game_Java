package units;

import java.util.Random;

public class Wizard extends MagicalCharacter{
    public Wizard(String name, int x, int y, int nT) {
        super(name, 10, 20, 4, new int[]{-5, -5}, 5, new Random().nextInt(1, 5), x, y, nT);
    }


}
