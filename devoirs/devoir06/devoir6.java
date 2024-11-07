public class devoir6 {

      //Declaration constante 
      final int TAILLE_TABLEAU = 20;
      final int VALEUR_MIN = 0;
      final int VALEUR_MAX = 50;
      final int VALEUR_RECHERCHE = 7;

      // méthode genereTableau
    public static int[] genereTableau(int taille, int min, int max){
int[] tableau = new int[taille];

for(int i = 0; i < tableau.length; i++) {
    tableau[i] = (int) (Math.random() * (max - min + 1)) + min
}

        return tableau;

    }
        
}
