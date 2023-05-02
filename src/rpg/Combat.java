package rpg;

public class Combat implements Evenements {

    private Personnage hero;
    private Personnage hero2;

    public Combat(Personnage hero, Personnage hero2){
        this.hero = hero;
        this.hero2 = hero2;
    }

    @Override
    public Personnage resoudre(){
        while(hero.IsAlive() && hero2.IsAlive()){
            hero.combattre(hero2);
            if(hero2.IsAlive()){
                hero2.combattre(hero);
            }
        }
        return (hero.IsAlive()) ? hero : hero2;
    }

}
