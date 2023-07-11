package unit;

import java.util.Random;

public class Spearman extends InfantryCharacter{
    public Spearman(String name) {

        super(name, new Random().nextInt(1, 6));
    }
}
