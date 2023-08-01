package Game.units;

import java.util.ArrayList;

public class  Monk extends Game.units.MagicalCharacter {
    public Monk(String name, int x, int y, int nT) {
        super(name, 15, new int[]{-1,-3}, 2, 10, x, y, nT, 5);
    }

    @Override
    public void step(ArrayList<BaseHero> enemy, ArrayList<BaseHero> team) {
        if(mana <= 0) return;
        if (super.findeDamagePerson(team).hp == super.findeDamagePerson(team).currentHp) return;

        else {
            super.findeDamagePerson(team).getDamage(damage[0]);
            mana += damage[0];
            if (super.findeDamagePerson(team).currentHp > super.findeDamagePerson(team).currentHp)
                super.findeDamagePerson(team).currentHp = super.findeDamagePerson(team).hp;
        }

    }

}
