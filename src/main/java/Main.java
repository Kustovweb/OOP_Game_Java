import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static String getName() {
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }
    public static void main(String[] args) {
        Peasant peasant = new Peasant("Peasant");
        Crossbowman crossbowman = new Crossbowman("Crossbowman");
        Monk monk = new Monk(getName());
        Rogue rogue = new Rogue(getName());
        Sniper sniper = new Sniper(getName());
        Spearman spearman = new Spearman(getName());
        Witch witch = new Witch(getName());

        ArrayList<BaseHero> oneTeam = new ArrayList<>();
        ArrayList<BaseHero> twoTeam = new ArrayList<>();
        fillList(oneTeam);
        fillList(twoTeam);

        oneTeam.forEach((BaseHero a) -> System.out.println(a.getInfo()));
        twoTeam.forEach((BaseHero a) -> System.out.println(a.getInfo()));

    }

    public static void fillList(ArrayList < BaseHero > list) {
        for (int i = 0; i < 10; i++) {
            int cnt = new Random().nextInt(7);
            switch (cnt) {
                case 1: list.add(new Crossbowman("Crossbowman"));
                    break;
                case 2: list.add(new Monk("Monk"));
                    break;
                case 3: list.add(new Rogue("Rogue"));
                    break;
                case 4: list.add(new Sniper("Sniper"));
                    break;
                case 5: list.add(new Spearman("Spearman"));
                    break;
                case 6: list.add(new Witch("Witch"));
                    break;
            }
        }
    }
}
