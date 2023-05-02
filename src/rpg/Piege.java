package rpg;
import java.util.Random;

public class Piege implements Evenements {

    private Personnage hero;
    public Piege(Personnage hero){
        this.hero = hero;
    }
    @Override
    public Personnage resoudre(){
        Random rand = new Random();
        int degatPiege;
        if(rand.nextBoolean()){
            degatPiege = +5;
        } else {
            degatPiege = -5;
        }
//        int degatPiege = rand.nextInt(11)-5;
        hero.setPV(hero.getPV() + (degatPiege));
        System.out.println(degatPiege + " de dégats");
        System.out.println("Il reste " + hero.getPV() + " PV à " + hero.getNom());

        return hero;
    }

}
