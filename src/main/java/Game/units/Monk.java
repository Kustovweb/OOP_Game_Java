package Game.units;

public class  Monk extends Game.units.MagicalCharacter {
    public Monk(String name, int x, int y, int nT) {
        super(name, 15, new int[]{2,3}, 3, 6, 2, x, y, nT, 5);
    }

}
