package units;

import java.util.Random;

public class Crossbowman extends ShooterCharacter {
    public Crossbowman(String name) {

        super(name, new Random().nextInt(1, 8));
    }
    @Override
    public String getInfo() {
        return "Crossbowman";
    }

    @Override
    public void step() {

    }
}
