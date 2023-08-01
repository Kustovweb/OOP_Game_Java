package Game.units;

import java.util.ArrayList;

public abstract class InfantryCharacter extends Game.units.BaseHero {
    public InfantryCharacter(String name, int hp, int[] damage, int attack, int luck, int x, int y, int nT, int initiative) {
        super(name, hp, damage, attack, luck, x, y, nT, initiative);

    }
    @Override
    public void step(ArrayList<BaseHero> enemy, ArrayList<BaseHero> team) {
        if (this.currentHp == 0) return;
        int k = super.findNearest(enemy);
        int[] coordStep = coordinats.coordStep(enemy.get(k).coordinats);
        for (int i = 0; i < team.size(); i++){
            if (team.get(i).coordinats.x == coordStep[0] && team.get(i).coordinats.y == coordStep[1]) {
                return;
            }
        }
        if (enemy.get(k).coordinats.x == coordStep[0] && enemy.get(k).coordinats.y == coordStep[1]) {
            enemy.get(k).getDamage((this.damage[1]+this.damage[0])/2);

//            if (teamProtivnic.get(k).curHp == 0)
            return;
        }

        this.coordinats.x = coordStep[0];
        this.coordinats.y = coordStep[1];

    }
}
