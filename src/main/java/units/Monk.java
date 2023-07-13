package units;

import java.util.Random;

public class Monk extends MagicalCharacter{
    public Monk(String name) {
        super(name, new Random().nextInt(1, 10));
    }

    @Override
    public String getInfo() {
        return "Monk";
    }

    @Override
    public void step() {

    }
}
