package Game.units;


import Game.Interface.BaseHeroInterface;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseHero implements BaseHeroInterface {

    protected String name; // имя
    protected int hp; // здоровье
    protected int currentHp; // текущее здоровье
    public int initiative; // ход
    protected int attack; // атака
    protected int[] damage;
    protected int luck; // удача (от величины удачи доп повреждения противнику, или доп защита)

    protected Coordinats coordinats;

    protected int numberTeam;
    public String status;

    public BaseHero(String name, int hp, int[] damage, int attack, int luck, int x, int y, int nT, int initiative) {
        this.name = name;
        this.hp = this.currentHp = hp;
        this.attack = attack;
        this.damage = damage;
        this.luck = luck;
        this.coordinats = new Game.units.Coordinats(x, y);
        this.numberTeam = nT;
        this.status = "Stand";
        this.initiative = initiative;
    }

    public int findNearest(ArrayList<BaseHero> enemy) {
        ArrayList<BaseHero> notDeadTeam = new ArrayList<BaseHero>();
        for (BaseHero bh: enemy ) {
            if (!bh.isDead()) notDeadTeam.add(bh);
        }
        double minDist = Game.units.Coordinats.Distance(coordinats.x, enemy.get(0).coordinats.x, coordinats.y, enemy.get(0).coordinats.y);
        int k = 0;

        for (int i = 1; i < enemy.size(); i++) {
            double R = Game.units.Coordinats.Distance(coordinats.x, enemy.get(i).coordinats.x, coordinats.y, enemy.get(i).coordinats.y);
           if (R < minDist) {
               minDist = R;
               k = i;
           }
        }
        System.out.println(getClass().getSimpleName()+" "+name+"- "+enemy.get(k).name+" "+minDist);
        return k;
    }
public void getDamage(float damage) {
    currentHp -= damage;
    if (this.currentHp <= 0) {
        this.status = "Die";
        this.currentHp = 0;
    }
    if (this.currentHp > this.hp) {
        this.currentHp = this.hp;
    }
}

public int[] getCoords() {
        int[] coord = new int[2];
        coord[0] = this.coordinats.x;
        coord[1] = this.coordinats.y;
        return coord;
}
public int getHp() {
        return this.currentHp;
}
public boolean isDead() {
        if (this.status == "Die") {
            return true;
        }
    return false;
}

    @Override
    public String getInfo() {
        return String.format(" %s %s %s \u2764: %s \u2661: %s \u2694: %s In: %s  X: %s Y: %s",this.getClass().getSimpleName(),this.name,
                this.status, this.hp, this.currentHp, Arrays.toString(this.damage) , this.initiative, this.coordinats.x, this.coordinats.y);
    }
//    @Override
//    public void step(ArrayList<BaseHero> enemy, ArrayList<BaseHero> team) {
//        System.out.println("Шаг вперед");
//    }


}
