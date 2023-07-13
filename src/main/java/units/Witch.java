package units;

import java.util.Random;

public class Witch extends MagicalCharacter{
    public Witch(String name) {
        super(name, new Random().nextInt(1, 5));
    }

    @Override
    public String getInfo() {
        return "Witch";
    }

    @Override
    public void step() {

    }
}
