import java.util.Scanner;

public class devoir03 {
    public static void main(String[] args) {
        // Déclaration des variables jour, mois, annee
        int jour, mois, annee;
        
        try (// Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in)) {
            // Entrer la date (jour, mois, année)
            System.out.println("Entrez le jour : ");
            jour = scanner.nextInt();
            
            System.out.println("Entrez le mois : ");
            mois = scanner.nextInt();
            
            System.out.println("Entrez l'année : ");
            annee = scanner.nextInt();
        }

        // Validation de la date
        if (annee < 0 || annee > 9999) {
            System.out.println("L'année doit être comprise entre 0 et 9999.");
            return;
        }

        if (mois < 1 || mois > 12) {
            System.out.println("Le mois doit être entre 1 et 12.");
            return;
        }

        if (jour < 1 || jour > 31) {
            System.out.println("Le jour est invalide.");
            return;
        }

        // Vérification des jours selon le mois
        if ((mois == 4 || mois == 6 || mois == 9 || mois == 11) && jour > 30) {
            System.out.println("Ce mois n'a que 30 jours.");
            return;
        }

        // Vérification des jours pour février (28 ou 29 jours)
        if (mois == 2) {
            if (estBissextile(annee)) {
                if (jour > 29) {
                    System.out.println("Le mois de février d'une année bissextile a 29 jours.");
                    return;
                }
            } else {
                if (jour > 28) {
                    System.out.println("Le mois de février a 28 jours.");
                    return;
                }
            }
        }

        // Calcul du jour de l'année
        int jourDeLAn = calculerJourDeLAn(jour, mois, annee);
        
        // Affichage du résultat
        System.out.println(jour + "/" + mois + "/" + annee + " est le jour " + jourDeLAn + " de l'An.");
    }

    // Méthode pour calculer si l'année est bissextile
    public static boolean estBissextile(int annee) {
        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Méthode pour calculer quel jour de l'année correspond la date donnée
    public static int calculerJourDeLAn(int jour, int mois, int annee) {
        int[] joursParMois;

        // Choisir le bon nombre de jours par mois en fonction de l'année bissextile ou non
        if (estBissextile(annee)) {
            joursParMois = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Année bissextile
        } else {
            joursParMois = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Année non bissextile
        }

        int jourDeLAn = 0;

        // Ajouter les jours des mois précédents
        for (int i = 0; i < mois - 1; i++) {
            jourDeLAn += joursParMois[i];
        }

        // Ajouter le jour du mois actuel
        jourDeLAn += jour;

        return jourDeLAn;
    }
}