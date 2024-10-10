public class ExercicesString {
    public static void main(String[] args) {
        // Déclaration et affectation de la variable maChaineDeCaractere
        String maChaineDeCaractere = "Voici du contenu stocké dans un String.";

        // Indiquer le nombre de caractères
        System.out.println("Nombre de caractères contenu dans la variable maChaineDeCaractere : " + maChaineDeCaractere.length());

        // Indiquer la position du mot "contenu"
        int positionContenu = maChaineDeCaractere.indexOf("contenu");
        System.out.println("Le mot \"contenu\" commence à la position : " + positionContenu);

        // Indiquer la lettre à la position 10
        char lettrePosition10 = maChaineDeCaractere.charAt(10);
        System.out.println("Le position 10 contient la lettre : " + lettrePosition10);

        // Déclaration et affectation de la variable monPrenom
        String monPrenom = "Nicolas";

        // Affichage lettre par lettre de monPrenom
        for (int i = 0; i < monPrenom.length(); i++) {
            System.out.println("La lettre à la position " + i + " est : " + monPrenom.charAt(i));
        }

        // Tester si monPrenom contient "test"
        if (monPrenom.contains("test")) {
            System.out.println("La chaîne de caractère \"" + monPrenom + "\" contient le texte \"test\".");
        } else {
            System.out.println("La chaîne de caractère \"" + monPrenom + "\" ne contient pas le texte \"test\".");
        }
    }
}
