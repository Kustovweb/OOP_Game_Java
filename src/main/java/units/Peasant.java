package units;

import java.util.Random;

public class Peasant extends BaseHero{
    public Peasant(String name) {
        super(name, 10, 0, 1, 0, new Random().nextInt(1, 4));
    }

    @Override
    public String getInfo() {
        return "Peasant";
    }

    @Override
    public void step() {

    }
}
