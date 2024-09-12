public class EchangeValeurs {
    public static void main(String[] args) {
        // Déclaration des variables
        int variable1 = 1;
        int variable2 = 2; 

         // Affichage des valeurs avant l'échange
         System.out.println("Le contenu de variable1 est : " + variable1 + ".");
         System.out.println("Le contenu de variable2 est : " + variable2 + ".");

          // Traitement : échange des valeurs
          int temp = variable1;
          variable1 = variable2;
          variable2 = temp;

          // Affichage des valeurs après l'échange
          System.out.println(".... Traitement ....");
          System.out.println("Le contenu de variable1 est : " + variable1 + ".");
          System.out.println("Le contenu de variable2 est : " + variable2 + ".");
        }  
    }