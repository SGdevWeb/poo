package rpg;

public class Arme implements Objet {

    private String nom;
    private int poids;
    private int degat;

    protected Arme(String nom,int poids, int degat) {
        this.nom = nom;
        this.poids = poids;
        this.degat = degat;
    }

    public int getDegat() {
        return degat;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }
    @Override
    public String getNom() {
        return this.nom;
    }
    @Override
    public void setNom(String nom) {
        this.nom = nom;

    }
    @Override
    public int getPoids() {
        return this.poids;
    }
    @Override
    public void setPoids(int poids) {
        this.poids = poids;
    }

    @Override
    public void utiliser(Personnage cible){
        cible.setArme(this);
        System.out.println(cible+" porte maintenant : "+this);
    }
    @Override
    public String toString() {
        return this.nom;
    }

}
