package rpg;

public class Combat {

    private Personnage perso1;
    private Personnage perso2;

    public Combat(Personnage perso1, Personnage perso2){
        this.perso1 = perso1;
        this.perso2 = perso2;
    }

    public Personnage resoudrecombat(){
        while(perso1.IsAlive() && perso2.IsAlive()){
            perso1.combattre(perso2);
            if(perso2.IsAlive()){
                perso2.combattre(perso1);
            }
        }
        return (perso1.IsAlive()) ? perso1 : perso2;
    }

}
