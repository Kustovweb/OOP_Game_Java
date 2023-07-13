package units;

import java.util.Random;

public class Sniper extends ShooterCharacter {
    public Sniper(String name) {

        super(name, new Random().nextInt(1, 5));
    }

    @Override
    public String getInfo() {
        return "Sniper";
    }

    @Override
    public void step() {

    }
}
