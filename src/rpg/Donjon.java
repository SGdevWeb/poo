package rpg;

import java.util.ArrayList;
import java.util.Random;

public class Donjon {

    private ArrayList<Personnage> monstres = new ArrayList<Personnage>();
    private Personnage hero;
    private int nbPiece;

    public Donjon(Personnage hero, int nbPiece){
        this.hero = hero;
        // générer un donjon
        Random rand = new Random();
        int i = 0;
        while (i < nbPiece){
            monstres.add( new Personnage(
                    rand.nextInt(10*(i+1), 20*(i+1)),
                    "gobelin"+(i+1),
                    new Arme("gourdin", 8),
                    new Armure("Bouclier en carton", 5)
            ));
            i++;
        }
    }

    public void run(){
        // parcourir le donjon
        for (int i = 0 ; i < this.monstres.size() ; i++){
            Personnage monstre = monstres.get(i);
            Combat arena = new Combat(this.hero, monstre);
            System.out.println(arena.resoudrecombat() + " est le grand vainqueur");
        }
        System.out.println(hero.IsAlive() ? "VICTOIRE !" : "GAME OVER");
    }

}
