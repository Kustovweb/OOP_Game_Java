package unit;

import java.util.Random;

public class Rogue extends InfantryCharacter{

    public Rogue(String name) {
        super(name, new Random().nextInt(1, 12));
    }
}
