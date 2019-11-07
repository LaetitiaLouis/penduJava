import java.util.Random;
import java.util.Scanner;

public class JeuPendu {
    static String[] tabMots = { "boulangerie", "meilleur", "pain", "restaurant", "elephant", "bonjour", "materiel",
            "panthere" };

    static int tailleDuMot, nbErreursRestantes = 11; // nbErreursRestantes = nombre de tours à jouer
    static String motChoisi; // mot à trouver
    static Random rdm = new Random(); // appelle l'objet Random qui choisi aléatoirement un mot dans tabMots
    static char[] caracDuMot; // tableau des lettres à trouver
    static String[] tabCar, lettresFausses = { "", "", "", "", "", "", "", "", "", "", "" }; // tabCar = tableau des
    // lettres que le joueur a proposées
    // lettresFausses = tableau de lettres proposées par le joueur qui ne sont pas dans le mot

    /**
     * permet de choisir un mot au hasard
     */
    public static void choisirUnMot() {
        //
        motChoisi = tabMots[rdm.nextInt(tabMots.length)];
        caracDuMot = motChoisi.toCharArray();
        tailleDuMot = caracDuMot.length;
        // System.out.println("le mot choisi est " + motChoisi); utilisé pour tester le
        // jeu
    }

    /**
     * permet de transformer les lettres du mot par des underscores
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

    /**
     * 
     * @param lettreChoisie
     * @return true si la lettre choisie par le joueur est dans le mot
     */
    public static boolean lettreTrouvee(char lettreChoisie) {
        boolean lettreTrouvee = false;
        for (int i = 0; i < tailleDuMot; i++) {
            if (caracDuMot[i] == lettreChoisie) {
                lettreTrouvee = true;
                tabCar[i] = String.valueOf(lettreChoisie);
            }
        }
        return lettreTrouvee;

    }

    public static void main(String[] args) {
        // propose au joueur de jouer au pendu
        System.out.println("Bonjour ! Etes vous prêt à jouer au pendu ?");

        // appelle la méthode choisirUnMot pour qu'un mot soit choisi au hasard dans
        // tabMots
        choisirUnMot();

        // appelle la méthode transformerMot pour afficher des underscores à la place
        // des caractères du mot
        transformerMot();

        // définit compteurErreur à 0
        int compteurErreurs = 0;
        //définit la variable motJuste, variable fausse par défaut. Elle deviendra vrai quand le joueur trouve le mot.
        boolean motJuste = false;

        Scanner sc = new Scanner(System.in);
        // tant que le nbre d'erreurs est supérieur à 0 et que motJuste est faux
        while (nbErreursRestantes > 0 && motJuste == false) {
            // appelle la méthode afficher pour afficher les lettres proposées par le joueur
            afficher(tabCar);
            // demande au joueur de choisir une nouvelle lettre
            System.out.println("Choisissez une lettre !");

             // attribue à lettreChoisie la 1ère lettre de la prochaine entrée du joueur
            char lettreChoisie = sc.next().toLowerCase().toCharArray()[0];

            //appelle la méthode lettreTrouvee pour vérifier que la lettreChoisie est dans le mot à trouver
            boolean lettreTrouvee = lettreTrouvee(lettreChoisie);

            //appelle la méthode vérifierMot pour savoir si tous les caractères du mot ont été trouvés
            motJuste = verifierMot();

             // si la lettre proposée par le joueur n'est pas dans le mot
            if (lettreTrouvee == false) {
                // le compteur du nombre de tours restant à jouer est imputé de 1
                nbErreursRestantes--;
                // informe le joueur que sa lettre n'est pas dans le mot et on lui précise le
                // nombre de fois où il peut encore proposer une lettre
                System.out.println("Votre lettre n'est pas dans le mot. Il vous reste " + nbErreursRestantes
                        + " choix de lettre possible.");

                // convertit caractère en String et on stocke la lettre fausse dans le
                // tableau de lettres fausses et on ajoute 1 au compteur d'erreurs
                lettresFausses[compteurErreurs] = String.valueOf(lettreChoisie);
                compteurErreurs++;
            }

             // rappelle au joueur les lettres "fausses" qu'il a déjà proposées
            System.out.print("Voici les lettres que vous avez déjà proposées et qui ne sont pas dans le mot : ");
            afficher(lettresFausses);
        }
        //si toutes les lettres du mot sont trouvées
        if (motJuste == true) {
            //indique au joueur qu'il a trouvé le mot
            System.out.println("Bravo! vous avez réussi !");
        } else {
            // informe le joueur qu'il a perdu si il a utilisé toutes ses chances de jouer 
            // indique le mot qu'il fallait trouver
            System.out.println("Vous avez perdu! Le mot qu'il fallait trouvé est : " + motChoisi + ".");
        }
    }
}
