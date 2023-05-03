package rpg;

import java.util.Random;

public class StaticData {
    private static final String[] listeAdjectifs = {
            "De pierre",
            "Filiforme",
            "Robuste",
            "Cassant",
            "Génial",
            "de diamant",
            "de fer",
            "en mousse",
            "moche",
            "le glorieux",
            "de lin",
            "le breton",
            "le flamand",
            "le ch'ti"
    };
    private static final String[] listeNoms = {
            "Alfred",
            "José",
            "Herbert",
            "Robert",
            "Dammian",
            "Anais",
            "Simon",
            "Samuel"
    };
    private static final String[] listeNomsArme = {
            "Canif",
            "Masse",
            "Gourdin",
            "Santoku",
            "Tourne-vis",
            "Marteau",
            "Pistolet a clou"
    };
    private static final String[] listeNomsArmure = {
            "Pagne",
            "Côte de maille",
            "Robe",
            "Bikini",
            "Calecon",
            "Grand manteau",
            "Cape",
            "Cuirrasse",
            "Bouclier"};

    public static final Armure[] listeArmures = {
            new Armure(StaticData.GenererNomArmure(), 1, 1),
            new Armure(StaticData.GenererNomArmure(), 2, 2),
            new Armure(StaticData.GenererNomArmure(), 3, 3),
            new Armure(StaticData.GenererNomArmure(), 4, 4),
            new Armure(StaticData.GenererNomArmure(), 5, 5),
            new Armure(StaticData.GenererNomArmure(), 10, 10),
            new Armure(StaticData.GenererNomArmure(), 15, 15),
            new Armure(StaticData.GenererNomArmure(), 20, 20),
    };
    public static final Arme[] listeArmes = {
            new Arme(StaticData.GenererNomArme(), 1, 1),
            new Arme(StaticData.GenererNomArme(), 2, 2),
            new Arme(StaticData.GenererNomArme(), 3, 3),
            new Arme(StaticData.GenererNomArme(), 4, 4),
            new Arme(StaticData.GenererNomArme(), 5, 5),
            new Arme(StaticData.GenererNomArme(), 10, 10),
            new Arme(StaticData.GenererNomArme(), 15, 15),
            new Arme(StaticData.GenererNomArme(), 20, 20),
    };


    public static String GenererNom() {
        return StaticData.GenererAssociation(StaticData.listeNoms, StaticData.listeAdjectifs);
    }

    public static String GenererNomArme() {
        return StaticData.GenererAssociation(StaticData.listeNomsArme, StaticData.listeAdjectifs);
    }

    public static String GenererNomArmure() {
        return StaticData.GenererAssociation(StaticData.listeNomsArmure, StaticData.listeAdjectifs);
    }

    /**
     * Concatène deux chaines de caractère aléatoirement choisit parmi deux tableaux
     * @param tableau1 un nom ?
     * @param tableau2 un adjectif ?
     * @return une chaine de caractère aléatoire
     */
    public static String GenererAssociation(String[] tableau1, String[] tableau2) {
        Random rand = new Random();
        return tableau1[rand.nextInt(tableau1.length)]
                +" "
                + tableau2[rand.nextInt(tableau2.length)];
    }
}
