package units;

import java.util.ArrayList;
import java.util.Random;

public class Farmer extends BaseHero{
    public Farmer(String name, int x, int y, int nT) {
        super(name, 10, 0, 0, new int[] {1, 1}, 0, new Random().nextInt(1, 5), x, y, nT);
    }


    @Override
    public void step(ArrayList<BaseHero> enemy, ArrayList<BaseHero> team) {
        super.step(enemy, team);
    }
}
