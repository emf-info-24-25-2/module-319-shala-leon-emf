public class devoir {

    // Déclaration des constantes
    static final int TAILLE_TABLEAU = 20;
    static final int VALEUR_MIN = 0;
    static final int VALEUR_MAX = 50;
    static final int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {
        // Génération du tableau avec la méthode genereTableau
        int[] tableau = genereTableau(TAILLE_TABLEAU, VALEUR_MIN, VALEUR_MAX);

        // Affichage du contenu du tableau
        System.out.print("Tableau généré: ");
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();

        // Recherche du minimum et maximum dans le tableau
        int min = rechercheMin(tableau);
        int max = rechercheMax(tableau);

        // Affichage du minimum et du maximum
        System.out.println("Valeur minimale: " + min);
        System.out.println("Valeur maximale: " + max);

        // Recherche de la valeur spécifiée dans le tableau
        int position = rechercheValeur(tableau, VALEUR_RECHERCHEE);
        System.out.println("Position de la valeur " + VALEUR_RECHERCHEE + ": " + position);
    }

    // Méthode pour générer un tableau d'entiers avec des valeurs aléatoires
    public static int[] genereTableau(int taille, int min, int max) {
        Random random = new Random();
        int[] tableau = new int[taille];

        for (int i = 0; i < taille; i++) {
            tableau[i] = random.nextInt(max - min + 1) + min;
        }

        return tableau;
    }

    // Méthode pour rechercher la valeur minimale dans un tableau
    public static int rechercheMin(int[] tableau) {
        int min = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
            }
        }
        return min;
    }

    // Méthode pour rechercher la valeur maximale dans un tableau
    public static int rechercheMax(int[] tableau) {
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    // Méthode pour rechercher une valeur dans un tableau
    public static int rechercheValeur(int[] tableau, int valeurRecherchee) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                return i; // Retourne l'index de la valeur
            }
        }
        return -1; // Si la valeur n'est pas trouvée, retourne -1
    }
}



