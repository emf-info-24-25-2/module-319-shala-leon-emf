public class ExerciceSwitch2 {
    public static void main(String[] args) {
        int age =7; // Decalrer la variable 1 avec celle que vous voulez

        // Teste switch
        switch (age) {
            case 7:
            System.out.println("Poussin");
                break;
            case 8:
            case 9:
            System.out.println("Pupile");
            break;
            case 10:
            case 11:
            System.out.println("Minime");
            break;
            default:
            System.out.println("inconnu");
                break;
        }

    }
}