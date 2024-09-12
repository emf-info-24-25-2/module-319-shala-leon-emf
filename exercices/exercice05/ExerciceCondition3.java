public class ExerciceCondition3 {
    public static void main(String[] args) {
        // Déclaration des variables
        int valeur1 = 3;  // Remplacez 3 par la première valeur que vous souhaitez tester
        int valeur2 = -4; // Remplacez -4 par la deuxième valeur que vous souhaitez tester

        // Déterminer le signe du résultat de la multiplication
        if ((valeur1 > 0 && valeur2 > 0) || (valeur1 < 0 && valeur2 < 0)) {
            System.out.println("Le résultat est positif");
        } else {
            System.out.println("Le résultat est négatif");
        }
    }
}

