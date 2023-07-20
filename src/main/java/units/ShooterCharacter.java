package units;

import java.util.ArrayList;

public abstract class ShooterCharacter extends BaseHero{
    protected int arrows;
    protected int range;
    public ShooterCharacter(String name, int luck, int x, int y, int nT) {
        super(name, 20, 0, 6, 3, luck, x, y, nT);
        this.arrows = 5;
        this.range = 5;
    }
    @Override
    public void step(ArrayList<BaseHero> enemy, ArrayList<BaseHero> team) {
        if (this.hp == 0 || arrows == 0) return;
        int k = super.findNearest(enemy);
        enemy.get(k).hp -= this.attack + this.luck;

        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getClass().getSimpleName().equals("Farmer")) return;

        }
        this.arrows -= 1;
    }
    @Override
    public String getInfo() {
        return "hp=" + this.hp + "name:" + this.getClass().getSimpleName() + "ammo" +" " + this.arrows;
    }
}
