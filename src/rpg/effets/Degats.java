package rpg.effets;

import rpg.Personnage;
import rpg.Effet;

public class Degats extends Effet{
    private int hp = 5;

    public Degats(int hp) {
        this.hp = hp;
    }
    @Override
    public void resoudre(Personnage cible) {
        System.out.println(cible + " est blessé de "+this.hp+" PV");
        cible.setPV(cible.getPV() - this.hp);
    }

}
