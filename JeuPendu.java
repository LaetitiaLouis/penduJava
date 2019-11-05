import java.util.Random;
import java.util.Scanner;

public class JeuPendu {
    static String[] tabMots = {"boulangerie", "meilleur", "pain", "restaurant", "elephant", "bonjour", "materiel",
            "panthere"}; 
    
    static int tailleDuMot, nbErreursRestantes = 11;    // nbErreursRestantes = nombre de tours à jouer
    static String motChoisi;                            // mot à trouver
    static Random rdm = new Random();                   // appelle l'objet Random qui choisi aléatoirement un mot dans tabMots
    static char[] caracDuMot;                           // tableau des lettres à trouver
    static String[] tabCar, lettresFausses = { "", "", "", "", "", "", "", "", "", "", "" };    // tabCar = tableau des lettres que le joueur a proposées

    /**
     * permet de choisir un mot au hasard
     */
    public static void choisirUnMot() {
        //
        motChoisi = tabMots[rdm.nextInt(tabMots.length)];
        caracDuMot = motChoisi.toCharArray();
        tailleDuMot = caracDuMot.length;
        // System.out.println("le mot choisi est " + motChoisi); a servi pour contrôler
        // le ot choisi
    }

    /**
     * permet de transformer les lettres du mot par des _
     */
    public static void transformerMot() {
        tabCar = new String[tailleDuMot];
        for (int i = 0; i < tailleDuMot; i++) {
            tabCar[i] = "_";
        }
    }

    /**
     * permet d'afficher le mot caché et les lettres trouvées
     */
    public static void afficher(String[] tableau) {
        for (String caracCourant : tableau) {
            System.out.print(caracCourant + " ");
        }
        System.out.println();
    }

    /**
     * compare les lettres trouvées et les lettres du mot
     * 
     * @return true si le mot est trouvé
     */
    public static boolean verifierMot() {
        boolean resultat = false;
        for (int i = 0; i < tailleDuMot; i++) {
            if (tabCar[i] != "_") {
                if (caracDuMot[i] == tabCar[i].charAt(0)) {
                    resultat = true;
                } else {
                    resultat = false;
                    return resultat;
                }
            } else {
                resultat = false;
                return resultat;
            }
        }
        return resultat;
    }

    public static void main(String[] args) {
        System.out.println("Bonjour ! Etes vous prêt à jouer au pendu ?");

        choisirUnMot();

        transformerMot();

        int compteurErreurs = 0;
        
        boolean motJuste = false;

        Scanner sc = new Scanner(System.in);
        while (nbErreursRestantes > 0 && motJuste == false) {

            afficher(tabCar);

            System.out.println("Choisissez une lettre !");

            char lettreChoisie = sc.next().toLowerCase().toCharArray()[0];

            boolean lettreTrouvee = false;
            for (int i = 0; i < tailleDuMot; i++) {
                if (caracDuMot[i] == lettreChoisie) {
                    lettreTrouvee = true;
                    tabCar[i] = String.valueOf(lettreChoisie);
                }
                motJuste = verifierMot();
            }

            if (lettreTrouvee == false) {
                nbErreursRestantes--;
                System.out.println("Votre lettre n'est pas dans le mot. Il vous reste " + nbErreursRestantes
                        + " choix de lettre possible.");

                lettresFausses[compteurErreurs] = String.valueOf(lettreChoisie);
                compteurErreurs++;
            }
            System.out.print("Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : ");
            afficher(lettresFausses);
        }
        if (motJuste == true) {
            System.out.println("Bravo! vous avez réussi !");
        } else {
            System.out.println("Vous avez perdu! Le mot qu'il fallait trouvé est : " + motChoisi + ".");
        }
    }
}
