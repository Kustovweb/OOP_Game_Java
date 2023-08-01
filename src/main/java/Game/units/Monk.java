package Game.units;

import java.util.ArrayList;

public class  Monk extends Game.units.MagicalCharacter {
    public Monk(String name, int x, int y, int nT) {
        super(name, 15, new int[]{2,3}, 3, 6, 2, x, y, nT, 5);
    }

    @Override
    public void step(ArrayList<BaseHero> teamProtivnic, ArrayList<BaseHero> team) {
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
