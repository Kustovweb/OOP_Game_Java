package units;

import java.util.ArrayList;

interface InGameInterface { // Default (package local)
    void step(ArrayList<BaseHero> enemy);
    String getInfo();
}
