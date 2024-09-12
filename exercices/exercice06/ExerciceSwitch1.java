public class ExerciceSwitch1 {
    public static void main(String[] args) {
        // Déclaration et initialisation de la variable
        int noteDuModule = 5; // Remplacez 5 par la note que vous souhaitez tester

        // Test avec switch
        switch (noteDuModule) {
            case 1:
                System.out.println("Travail non rendu");
                break;
            case 2:
                System.out.println("Très insuffisant");
                break;
            case 3:
                System.out.println("Insuffisant");
                break;
            case 4:
                System.out.println("Suffisant");
                break;
            case 5:
                System.out.println("Bien");
                break;
            case 6:
                System.out.println("Très bien");
                break;
            default:
                System.out.println("Note invalide");
                break;
        }
    }
}





   