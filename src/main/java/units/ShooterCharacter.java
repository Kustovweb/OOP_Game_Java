package units;

import java.util.ArrayList;
import java.util.Random;

public abstract class ShooterCharacter extends BaseHero{
    protected int arrows;
    protected int range;
    public ShooterCharacter(String name, int hp, int mp, int armor, int[] damage, int attack, int luck, int x, int y, int nT) {
        super(name, hp, mp, armor, damage, attack, luck, x, y, nT);
        this.arrows = 5;
        this.range = 5;
    }
    @Override
    public void step(ArrayList<BaseHero> enemy, ArrayList<BaseHero> team) {
        if (this.hp == 0 || arrows == 0) return;
        int k = super.findNearest(enemy);
        enemy.get(k).getDamage(this.attack + this.luck);

        for (BaseHero baseHero : team) {
            if (baseHero.getClass().getSimpleName().equals("Farmer") && baseHero.status.equals("Stand")) {
                baseHero.status = "Busy";
                return;
            }
            ;

        }
        this.arrows -= 1;
    }
    @Override
    public String getInfo() {
        return "hp=" + this.hp + "name:" + this.getClass().getSimpleName() + " Стрел:" + " " + this.arrows;
    }
}
