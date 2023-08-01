package Game.units;

import java.util.ArrayList;

public abstract class ShooterCharacter extends Game.units.BaseHero {
    protected int arrows;
    protected int range;
    public ShooterCharacter(String name, int hp, int[] damage, int attack, int luck, int x, int y, int nT, int initiative) {
        super(name, hp, damage, attack, luck, x, y, nT, initiative);
        this.arrows = 5;
        this.range = 5;
    }
    @Override
    public void step(ArrayList<Game.units.BaseHero> enemy, ArrayList<Game.units.BaseHero> team) {
        if (this.hp == 0 || arrows == 0) return;
        int k = super.findNearest(enemy);
        enemy.get(k).getDamage(this.attack + this.luck);

        for (Game.units.BaseHero baseHero : team) {
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
