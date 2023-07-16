package units;

import java.util.ArrayList;

public abstract class ShooterCharacter extends BaseHero{
    public ShooterCharacter(String name, int luck, int x, int y, int nT) {
        super(name, 20, 0, 6, 3, luck, x, y, nT);
    }
    @Override
    public void step(ArrayList<BaseHero> enemy) {
        int k = findNearest(enemy);
}}
