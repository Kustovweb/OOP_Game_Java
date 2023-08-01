package Game.units;

import java.util.ArrayList;
import java.util.Random;

public class Farmer extends Game.units.BaseHero {
    public Farmer(String name, int x, int y, int nT) {
        super(name, 10, new int[]{0,0}, 0, 2, x, y, nT, 1);
    }


    @Override
    public void step(ArrayList<BaseHero> enemy, ArrayList<BaseHero> team) {
        if (this.currentHp == 0) return;
        status ="Stand";
    }
}
