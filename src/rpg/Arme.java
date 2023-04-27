package rpg;

public class Arme {
    private String name;
    private int degat;

    protected Arme(String name, int degat) {
        this.name = name;
        this.degat = degat;
    }

    public String getName() {
        return name;
    }

    public int getDegat() {
        return degat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }
}
