package rpg;

public class Combat extends Evenements {

    private Personnage perso2;

    public Combat(Personnage perso1, Personnage perso2){
        super(perso1);
        this.perso2 = perso2;
    }

    public Personnage resoudre(){
        while(perso1.IsAlive() && perso2.IsAlive()){
            perso1.combattre(perso2);
            if(perso2.IsAlive()){
                perso2.combattre(perso1);
            }
        }
        return (perso1.IsAlive()) ? perso1 : perso2;
    }

}
