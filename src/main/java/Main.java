import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
    public static void main(String[] args) {
        ArrayList<BaseHero> oneTeam = new ArrayList<>();
        ArrayList<BaseHero> twoTeam = new ArrayList<>();
        fillList(oneTeam, 1, 1);
        fillList(twoTeam, 10, 2);

        oneTeam.forEach(n -> System.out.println(n.getInfo()));
        twoTeam.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("--------");
        oneTeam.forEach(n -> n.step(oneTeam, twoTeam));
        twoTeam.forEach(n -> n.step(twoTeam, oneTeam));
        System.out.println("--------");
        oneTeam.forEach(n -> System.out.println(n.getInfo()));
        twoTeam.forEach(n -> System.out.println(n.getInfo()));

    }

    public static void fillList(ArrayList < BaseHero > list, int k, int nT) {
        for (int i = 1; i < 10; i++) {
            int cnt = new Random().nextInt(8);
            switch (cnt) {
                case 1 -> list.add(new Crossbowman(getName(), k, i, nT));
                case 2 -> list.add(new Monk(getName(), k, i, nT));
                case 3 -> list.add(new Rogue(getName(), k, i, nT));
                case 4 -> list.add(new Sniper(getName(), k, i, nT));
                case 5 -> list.add(new Spearman(getName(), k, i, nT));
                case 6 -> list.add(new Wizard(getName(), k, i, nT));
                case 7 -> list.add(new Farmer(getName(), k, i, nT));
            }
        }
    }
}
