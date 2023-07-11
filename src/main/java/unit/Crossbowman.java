package unit;

import java.util.Random;

public class Crossbowman extends ShooterCharacter {
    public Crossbowman(String name) {

        super(name, new Random().nextInt(1, 8));
    }
}
