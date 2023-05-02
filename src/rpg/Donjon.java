package rpg;

import java.util.ArrayList;
import java.util.Random;

public class Donjon {

    private ArrayList<Personnage> monstres = new ArrayList<>();
    private Personnage hero;
    private int nbPiece;
    private ArrayList<Evenements> pieces = new ArrayList<>();

    public Donjon(Personnage hero, int nbPiece){
        this.hero = hero;
        // générateur de monstres
        Random rand = new Random();
        int i = 0;
        while (i < nbPiece){
            if(rand.nextBoolean()){
                this.pieces.add(new Combat(this.hero, new Personnage(
                    rand.nextInt(10*(i+1), 20*(i+1)),
                    StaticData.GenererNom(),
                    StaticData.listeArmes[i],
                    StaticData.listeArmures[i])));
            } else {
                this.pieces.add(new Piege(this.hero));
            }
//            this.monstres.add( new Personnage(
//                    rand.nextInt(10*(i+1), 20*(i+1)),
//                    StaticData.GenererNom(),
//                    StaticData.listeArmes[i],
//                    StaticData.listeArmures[i]
//            ));
            i++;
        }
    }

    public void run(){
        // parcourir le donjon salle par salle
        for (int i = 0 ; i < this.pieces.size() ; i++){

            if(this.hero.getPV() < 60) {
                Potion potion = new Potion("potionDeSoin",1,5);
                potion.utiliser(this.hero);
                System.out.println(potion.getPV() + " PV ajouté");
            }

            System.out.println(pieces.get(i).resoudre() + " est le grand vainqueur");
        }
        System.out.println(hero.IsAlive() ? "VICTOIRE !" : "GAME OVER");
    }

}
