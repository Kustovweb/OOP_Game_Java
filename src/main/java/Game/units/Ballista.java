package Game.units;

public class Ballista extends Game.units.ShooterCharacter{

    public Ballista(String name, int x, int y, int nT) {
        super(name, 15, new int[]{2, 7}, 12, 10, 20, x, y, nT, 2);
    }
}
