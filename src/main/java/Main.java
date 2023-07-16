import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static String getName() {
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }
    public static void main(String[] args) {
        ArrayList<BaseHero> oneTeam = new ArrayList<>();
        ArrayList<BaseHero> twoTeam = new ArrayList<>();
        fillList(oneTeam, 1, 1);
        fillList(twoTeam, 10, 2);

        oneTeam.forEach((BaseHero a) -> System.out.println(a.getInfo()));
        twoTeam.forEach((BaseHero a) -> System.out.println(a.getInfo()));

        oneTeam.forEach(n -> n.step(twoTeam));
        twoTeam.forEach(n -> n.step(oneTeam));

    }

    public static void fillList(ArrayList < BaseHero > list, int k, int nT) {
        for (int i = 1; i < 10; i++) {
            int cnt = new Random().nextInt(7);
            switch (cnt) {
                case 1: list.add(new Crossbowman(getName(), k, i, nT));
                    break;
                case 2: list.add(new Monk(getName(), k, i, nT));
                    break;
                case 3: list.add(new Rogue(getName(), k, i, nT));
                    break;
                case 4: list.add(new Sniper(getName(), k, i, nT));
                    break;
                case 5: list.add(new Spearman(getName(), k, i, nT));
                    break;
                case 6: list.add(new Witch(getName(), k, i, nT));
                    break;
            }
        }
    }
}
