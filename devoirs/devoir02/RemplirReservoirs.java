
public class RemplirReservoirs {
    public static void main(String[] args) {
        // Déclaration des constantes pour les capacités des réservoirs
        final int CAPACITE_RESERVOIR_A = 3;
        final int CAPACITE_RESERVOIR_B = 5;

        // Déclaration des variables pour les réservoirs et initialisation à 0 (vides)
        int reservoirA = 0;
        int reservoirB = 0;

        // déclaration de la variable de remplissage
        int remplissage = 5;

        // Affichage du nombre de litres à remplir
        System.out.println("Nombre de litres à remplir : " + remplissage);

        // Boucle de remplissage des réservoirs
        while (reservoirA + reservoirB < remplissage) {
            if (reservoirA < CAPACITE_RESERVOIR_A) {
                reservoirA++;
            } else if (reservoirB < CAPACITE_RESERVOIR_B) {
                reservoirB++;
            }

            // Affichage du niveau des réservoirs après chaque itération
            System.out.println("Niveau du réservoir A : " + reservoirA + " litres, Réservoir B : " + reservoirB + " litres");
        }

        // Affichage final une fois la boucle terminée
        System.out.println("Remplissage terminé !");
    }
}
