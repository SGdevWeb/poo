package rpg;

public abstract class Evenements {

    protected Personnage perso1;

    public Evenements(Personnage perso1){
        this.perso1 = perso1;
    }
    public abstract Personnage resoudre();

}
