package Game.units;

import java.util.ArrayList;

public abstract class ShooterCharacter extends Game.units.BaseHero {
    int range;
    int capacity;
    public ShooterCharacter(String name, int hp, int[] damage, int range, int capacity, int attack,  int x, int y, int nT, int initiative) {
        super(name, hp, damage, attack, x, y, nT, initiative);
        this.range = range;
        this.capacity = capacity;
    }

    @Override
    public void step(ArrayList<BaseHero> enemy, ArrayList<BaseHero> team) {
        if (this.currentHp == 0) return;

        int k = super.findNearest(enemy);
        enemy.get(k).getDamage( (this.damage[1] + this.damage[0]) /2);

        for(BaseHero bh: team){
            if (bh.getClass() == Farmer.class && bh.status.equals("Stand")){
                bh.status.equals("Busy");
                if (this.capacity == 0) this.capacity +=1 ;

                return;
            }

        }
        this.capacity -= 1;
    }

    @Override
    public String getInfo() {
        return String.format("%s \u27B3: %s", super.getInfo(), this.capacity);
    }
}
