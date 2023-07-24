package units;


import java.util.ArrayList;

public abstract class BaseHero implements InGameInterface{

    protected String name; // имя
    protected int hp; // здоровье
    protected int currentHp; // текущее здоровье
    protected int mp; // мана
    protected int getCurrentMp; // текущая мана
    protected int initiative; // ход
    protected int armor; // защита
    protected int attack; // атака
    protected int[] damage;
    protected int luck; // удача (от величины удачи доп повреждения противнику, или доп защита)

    protected Coordinats coordinats;

    protected int numberTeam;
    protected String status;

    public BaseHero(String name, int hp, int mp, int armor, int[] damage, int attack, int luck, int x, int y, int nT) {
        this.name = name;
        this.hp = this.currentHp = hp;
        this.mp = this.getCurrentMp = mp;
        this.armor = armor;
        this.attack = attack;
        this.damage = damage;
        this.luck = luck;
        this.coordinats = new Coordinats(x, y);
        this.numberTeam = nT;
        this.status = "Stand";
    }

    public int findNearest(ArrayList<BaseHero> enemy) {
        double minDist = Coordinats.Distance(coordinats.x, enemy.get(0).coordinats.x, coordinats.y, enemy.get(0).coordinats.y);
        int k = 0;

        for (int i = 1; i < enemy.size(); i++) {
            double R = Coordinats.Distance(coordinats.x, enemy.get(i).coordinats.x, coordinats.y, enemy.get(i).coordinats.y);
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
    if (currentHp <= 0) {
        status = "Die";
        currentHp = 0;
    }
    if (currentHp > hp) {
        currentHp = hp;
    }
}


    @Override
    public String getInfo() {
//        return this.getClass().getSimpleName() + " " + name + " " + coordinats;
        return "hp=" + this.hp + " name:" + this.getClass().getSimpleName();
    }
    @Override
    public void step(ArrayList<BaseHero> enemy, ArrayList<BaseHero> team) {
        System.out.println("Шаг вперед");
    }


}
