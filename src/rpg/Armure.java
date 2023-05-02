package rpg;

public class Armure implements Objet {
    private String nom;
    private int poids;
    private int defense;

    protected Armure(String nom, int poids, int defense) {
        this.nom = nom;
        this.poids = poids;
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
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
        cible.setArmure(this);
        System.out.println(cible+" porte maintenant : "+this);
    }
    @Override
    public String toString() {
        return this.nom;
    }
}
