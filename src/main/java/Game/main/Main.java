package Game.main;

import Game.units.*;
import Game.views.View;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static String getName(){
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }
    public static ArrayList<BaseHero> team1;
    public static ArrayList<BaseHero> team2;
    public static ArrayList<BaseHero> teamAll;
    public static void main(String[] args) {
        team1 = newTeam(1,1);
        team2 = newTeam(10,2);
        teamAll = new ArrayList<BaseHero>(20);
        teamAll.addAll(team1);
        teamAll.addAll(team2);

        teamAll.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                return o1.initiative - o2.initiative;
            }
        });

        Scanner in  = new Scanner(System.in);
        while (isNotLooser(team1) && isNotLooser(team2)) {
            View.view();
            for (BaseHero bh: teamAll) {
                if (team1.contains(bh)) {
                    bh.step(team2, team1);
                } else {
                    bh.step(team1, team2);
                }
            }
            in.nextLine();
        }
        View.view();
        if (isNotLooser(team1)) {
            System.out.println("Green side win!");
        } else {
            System.out.println("Blue side win!");
        }
    }

    public static ArrayList<BaseHero> newTeam(int k, int nT) {
        ArrayList<BaseHero> team = new ArrayList<BaseHero>(10);
        for (int i = 1; i < 10; i++) {
            int cnt = new Random().nextInt(8);
            switch (cnt) {
                case 1 -> team.add(new Crossbowman(getName(), k, i, nT));
                case 2 -> team.add(new Monk(getName(), k, i, nT));
                case 3 -> team.add(new Rogue(getName(), k, i, nT));
                case 4 -> team.add(new Sniper(getName(), k, i, nT));
                case 5 -> team.add(new Spearman(getName(), k, i, nT));
                case 6 -> team.add(new Wizard(getName(), k, i, nT));
                case 7 -> team.add(new Farmer(getName(), k, i, nT));
            }
        }
        return team;
    }

    public static boolean isNotLooser (ArrayList<BaseHero> team) {
        int count = 0;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).isDead()) {
                count++;
            }
        }

        if (count == team.size()) {
            return false;
        }
        return true;
    }
}
