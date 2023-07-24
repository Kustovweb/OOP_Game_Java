package units;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class MagicalCharacter extends BaseHero{
    public MagicalCharacter(String name, int hp, int mp, int armor, int[] damage, int attack, int luck, int x, int y, int nT) {
        super(name, hp, mp, armor, damage, attack, luck, x, y, nT);
    }

    @Override
    public void step(ArrayList<BaseHero> enemy, ArrayList<BaseHero> team) {
        int k = findNearest(enemy);
        team.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                return (int) ((o1.hp - o1.currentHp) - (o2.hp - o2.currentHp));
            }
        });
        team.get(0).getDamage(damage[0]);
    }
    @Override
    public String getInfo() {
        return "hp=" + this.hp + "name:" + this.getClass().getSimpleName();
    }


}
