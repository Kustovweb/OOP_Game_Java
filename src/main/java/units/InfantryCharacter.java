package units;

import java.util.ArrayList;

public abstract class InfantryCharacter extends BaseHero{
    public InfantryCharacter(String name, int luck, int x, int y, int nT) {
        super(name, 30, 0, 7, 7, luck, x, y, nT);
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
