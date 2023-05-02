package rpg.effets;

import rpg.Personnage;
import rpg.Effet;

public class Soin extends Effet{
    private int hp = 5;

    public Soin(int hp) {
        this.hp = hp;
    }
    @Override
    public void resoudre(Personnage cible) {
        System.out.println(cible + " est soigné de "+this.hp+" PV");
        cible.setPV(cible.getPV() + this.hp);
    }

}