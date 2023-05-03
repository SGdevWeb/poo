package rpg;

import java.util.ArrayList;

public class Personnage {
    private int PV;
    private String nom;
    private Arme arme;
    private Armure armure;
    private ArrayList<Objet> inventaire = new ArrayList<Objet>();

    protected Personnage(int PV, String nom, Arme arme, Armure armure){
        this.PV = PV;
        this.nom = nom;
        this.arme = arme;
        this.armure = armure;
    }

    /**
     * La méthode combattre permet le combat entre deux personnages
     * @param ennemi
     */
    protected void combattre(Personnage ennemi) {
        System.out.println(this.nom + " attaque " + ennemi.getNom());

        int degatAttaque;
        degatAttaque = (this.getArme() != null) ? this.getArme().getDegat() : 0;
        degatAttaque -= (ennemi.getArmure() != null) ? (0.1f * ennemi.armure.getDefense()) : 0;
        ennemi.setPV(ennemi.getPV() - degatAttaque);
        if (!ennemi.IsAlive()) {
            if (ennemi.getArme().getDegat() > this.getArme().getDegat()){
                this.inventaire.add(this.arme);
                ennemi.getArme().utiliser(this);
            } else {
                this.inventaire.add(ennemi.arme);
            }
            if (ennemi.getArmure().getDefense() > this.getArmure().getDefense()){
                this.inventaire.add(this.armure);
                ennemi.getArme().utiliser(this);
            } else {
                this.inventaire.add(ennemi.armure);
            }

        }
        System.out.println(ennemi.IsAlive() ? ("Pv de " + this.toString()) : (ennemi.getNom() + " est vaincu !"));
//        if (ennemi.getPV() > 0){
//            System.out.println("PV de " + this.toString());
//        } else {
//            System.out.println(ennemi.getNom() + " est vaincu !");
//            ennemi.setPV(0);
//        }
    }

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        if (this.arme != null) {
            inventaire.add(this.arme);
        }
        this.arme = arme;
    }

    public Armure getArmure() {
        return armure;
    }

    public void setArmure(Armure armure) {
        if (this.armure != null) {
            inventaire.add(this.armure);
        }
        this.armure = armure;
    }

    /**
     * Le personnage est-il encore en vie ?
     * @return boolean
     */
    public boolean IsAlive() {
        return this.getPV() > 0;
    }

    @Override
    public String toString(){
        return this.getNom() + " : " + this.getPV();
    }

    public ArrayList<Objet> getInventaire() {
        return inventaire;
    }

    public void setInventaire(ArrayList<Objet> inventaire) {
        this.inventaire = inventaire;
    }
}
