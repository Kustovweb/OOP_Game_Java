import unit.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Peasant peasant = new Peasant("Peasant", 10, 0, 1, 0, 1);
        Crossbowman crossbowman = new Crossbowman("Crossbowman", 20, 0, 6, 3, 3);
        Monk monk = new Monk("Monk", 20, 20, 5, 5, 3);
        Rogue rogue = new Rogue("Rogue", 30, 0, 7, 7, 3);
        Sniper sniper = new Sniper("Sniper", 20, 0, 5, 5, 5);
        Spearman spearman = new Spearman("Spearman", 30, 0, 7, 7, 3);
        Witch witch = new Witch("Witch", 20, 20, 5, 4, 3);
    }
}
