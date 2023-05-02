package rpg;

public class Potion extends Objet {

    int PV = 5;

    protected Potion(String nom, int poids, int PV) {
        super(nom, poids);
        this.PV = PV;
    }

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    @Override
    public void utiliser(Personnage cible) {
        cible.setPV(cible.getPV() + this.PV);
    }
}
