package rpg;

public class Arme extends Objet {
    private int degat;

    protected Arme(String nom,int poids, int degat) {
        super(nom, poids);
        this.degat = degat;
    }

    public int getDegat() {
        return degat;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }
}
