package rpg;

import java.util.ArrayList;
import java.lang.Math;
// import java.util.Random

public class Main {
    public static void main(String[] args) {

//        Arme arme1 = new Arme("Epée rouillée", 10);
//        Armure armure1 = new Armure("Armure en carton", 5);
//        Personnage personnage1 = new Personnage(100, "Jean-Paul", arme1, armure1);
//
//        Arme arme2 = new Arme("Masse", 15);
//        Armure armure2 = new Armure("Armure en carton", 8);
//        Personnage personnage2 = new Personnage(30, "Gobelin",arme2, armure2);
//
//        do {
//            personnage1.combattre(personnage2);
//            if(personnage2.getPV()>0){
//                personnage2.combattre(personnage1);
//            }
//        } while (personnage1.getPV()>0 && personnage2.getPV()>0);


        // Random PV
        // Random random = new Random();
        //
        // random.nextFloat(5f * (i+1), 10f * (i+1))

        Arme arme1 = new Arme("Epée rouillée", 10);
        Armure armure1 = new Armure("Armure en carton", 5);

        Arme arme2 = new Arme("Masse", 15);
        Armure armure2 = new Armure("Armure en carton", 8);

        Personnage personnage1 = new Personnage(100, "Jean-Paul", arme1, armure1);

        int randomEnnemi = (int) (Math.random()*(10-1) + 1);
        System.out.println(randomEnnemi);

        ArrayList<Personnage> ennemis = new ArrayList<Personnage>(randomEnnemi);

        int i = 0;
        while (i < randomEnnemi){
            ennemis.add( new Personnage(10,"gobelin"+(i+1),arme2,armure2));
            i++;
        }

        for (int j=0 ; j < ennemis.size() ; j++){
            Personnage ennemi = ennemis.get(j);
            // combat
            Combat arena = new Combat(personnage1, ennemi);
            System.out.println(arena.resoudrecombat().getNom() + " est le grand vainqueur");

        }

        if (personnage1.getPV() > 0){
            System.out.println("VICTOIRE !");
        } else {
            System.out.println("GAME OVER");
        }
    }
}
