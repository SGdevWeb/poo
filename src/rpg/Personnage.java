package rpg;

import java.lang.Math;

public class Personnage {
    private int PV;
    private String nom;
    private Arme arme;
    private Armure armure;

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
        int nouveauPv;
        degatAttaque = this.arme.getDegat() - Math.round(0.1f * ennemi.armure.getDefense());
        nouveauPv = ennemi.getPV() - degatAttaque;
        ennemi.setPV(nouveauPv);
        if (ennemi.getPV() > 0){
            System.out.println("PV de " + this.toString());
        } else {
            System.out.println(ennemi.getNom() + " est vaincu !");
            ennemi.setPV(0);
        }

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
        this.arme = arme;
    }

    public Armure getArmure() {
        return armure;
    }

    public void setArmure(Armure armure) {
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
}
