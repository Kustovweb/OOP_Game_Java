package unit;

public abstract class BaseHero {
    protected String name; // имя
    protected int hp; // здоровье
    protected int currentHp; // текущее здоровье
    protected int mp; // мана
    protected int getCurrentMp; // текущая мана
    protected int initiative; // ход
    protected int armor; // защита
    protected int attack; // атака
    protected int luck; // удача (от величины удачи доп повреждения противнику, или доп защита)

    public BaseHero(String name, int hp, int mp, int armor, int attack, int luck) {
        this.name = name;
        this.hp = this.currentHp = hp;
        this.mp = this.getCurrentMp = mp;
        this.armor = armor;
        this.attack = attack;
        this.luck = luck;
    }

}
