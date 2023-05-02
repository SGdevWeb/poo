package rpg;

import java.util.ArrayList;

public class Potion implements Objet {

    private String nom;
    private int poids;
    private ArrayList<Effet> effects = new ArrayList<>();

    protected Potion(String nom, int poids, ArrayList<Effet> effects) {
        this.nom = nom;
        this.poids = poids;
        this.effects = effects;
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
    public void utiliser(Personnage cible) {
        for(Effet effect : this.effects) {
            effect.resoudre(cible);
        }
    }
}
