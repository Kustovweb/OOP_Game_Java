package units;

import java.util.Random;

public class Spearman extends InfantryCharacter{
    public Spearman(String name) {

        super(name, new Random().nextInt(1, 6));
    }

    @Override
    public String getInfo() {
        return "Spearman";
    }

    @Override
    public void step() {

    }
}
