package units;

import java.util.ArrayList;
import java.util.Random;

public abstract class InfantryCharacter extends BaseHero{
    public InfantryCharacter(String name, int hp, int mp, int armor, int[] damage, int attack, int luck, int x, int y, int nT) {
        super(name, hp, mp, armor, damage, attack, luck, x, y, nT);

    }
    @Override
    public void step(ArrayList<BaseHero> enemy, ArrayList<BaseHero> team) {
        int k = findNearest(enemy);
    }
    @Override
    public String getInfo() {
        return "hp=" + this.hp + "name:" + this.getClass().getSimpleName();
    }
}
