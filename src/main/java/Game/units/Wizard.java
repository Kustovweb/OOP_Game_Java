package Game.units;

import java.util.ArrayList;

public class Wizard extends Game.units.MagicalCharacter {
    public Wizard(String name, int x, int y, int nT) {
        super(name, 21, new int[]{1,5}, 5, 3, x, y, nT, 3);

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


