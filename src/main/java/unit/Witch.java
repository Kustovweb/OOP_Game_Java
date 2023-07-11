package unit;

import java.util.Random;

public class Witch extends MagicalCharacter{
    public Witch(String name) {
        super(name, new Random().nextInt(1, 5));
    }
}
