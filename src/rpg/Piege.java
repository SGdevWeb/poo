package rpg;
import java.util.Random;

public class Piege extends Evenements {

    public Piege(Personnage perso1){
        super(perso1);
    }

    public Personnage resoudre(){
        Random rand = new Random();
        int degatPiege;
        if(rand.nextBoolean()){
            degatPiege = +5;
        } else {
            degatPiege = -5;
        }
//        int degatPiege = rand.nextInt(11)-5;
        perso1.setPV(perso1.getPV() + (degatPiege));
        System.out.println(degatPiege + " de dégats");
        System.out.println("Il reste " + perso1.getPV() + " PV à " + perso1.getNom());

        return perso1;
    }

}
