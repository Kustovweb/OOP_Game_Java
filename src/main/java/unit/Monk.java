package unit;

import java.util.Random;

public class Monk extends MagicalCharacter{
    public Monk(String name) {
        super(name, new Random().nextInt(1, 10));
    }
}
