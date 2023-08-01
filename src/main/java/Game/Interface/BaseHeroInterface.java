package Game.Interface;

import java.util.ArrayList;

public interface BaseHeroInterface {
    void step(ArrayList<Game.units.BaseHero> enemy, ArrayList<Game.units.BaseHero> team);
    String getInfo();

}
