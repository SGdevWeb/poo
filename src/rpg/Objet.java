package rpg;

public interface Objet {

    public String getNom();

    public void setNom(String nom);

    public int getPoids();

    public void setPoids(int poids);

    public abstract void utiliser(Personnage cible);
}
