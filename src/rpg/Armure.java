package rpg;

public class Armure extends Objet {
    private int defense;

    protected Armure(String nom, int poids, int defense) {
        super(nom, poids);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void utiliser(Personnage cible){
        cible.setArmure(this);
    }
}
