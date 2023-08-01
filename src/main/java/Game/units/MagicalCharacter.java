package Game.units;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class MagicalCharacter extends Game.units.BaseHero {
    int mana;
    public MagicalCharacter(String name, int hp, int[] damage, int mana, int attack, int x, int y, int nT, int initiative) {
        super(name, hp, damage, attack, x, y, nT, initiative);
        this.mana = mana;
    }

    @Override
    public void step(ArrayList<Game.units.BaseHero> enemy, ArrayList<Game.units.BaseHero> team) {
        int k = findNearest(enemy);
        team.sort(new Comparator<Game.units.BaseHero>() {
            @Override
            public int compare(Game.units.BaseHero o1, Game.units.BaseHero o2) {
                return (int) ((o1.hp - o1.currentHp) - (o2.hp - o2.currentHp));
            }
        });
        team.get(0).getDamage(damage[0]);
    }
    @Override
    public String getInfo() {
        return String.format("%s \u2747: %s", super.getInfo(), this.mana);
    }

    public BaseHero findeDamagePerson(ArrayList<BaseHero> team){
        ArrayList<BaseHero> damageSort = new ArrayList<BaseHero>(10);
        damageSort = team;
        damageSort.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                return (int) ((o1.hp - o1.currentHp) - (o2.hp - o2.currentHp));
            }
        });
        return damageSort.get(0);
    }


}
