import java.util.Random;
import java.util.Scanner;

public class devoir05 {
public static void main(String[] args) {
        // Initialiser le scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Générer un nombre aléatoire entre 1 et 100
        Random random = new Random();
        int nombreMystere = random.nextInt(100) + 1;

        // Initialiser la variable qui stockera la tentative de l'utilisateur
        int tentative = 0;

        // Boucle pour répéter les essais jusqu'à ce que le nombre soit trouvé
        while (tentative != nombreMystere) {
            // Demander à l'utilisateur de deviner un nombre
            System.out.print("Devinez un nombre entre 1 et 100 : ");
            tentative = scanner.nextInt();

            // Vérifier si le nombre est trop petit, trop grand ou correct
            if (tentative < nombreMystere) {
                System.out.println("Trop petit !");
            } else if (tentative > nombreMystere) {
                System.out.println("Trop grand !");
            } else {
                //RIF: c'est bien! pensez aussi à compter le nombre de tentatives du joueur
                System.out.println("Bravo, trouvé !");
            }
        }

        // Fermer le scanner (bonne pratique)
        scanner.close();
    }
    
}
