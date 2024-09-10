public class devoir01 {
    public static void main(String[] args) {
        int monAge =16;
        boolean estMajeur;
        System.err.println("Je m'appelle Shala Leon");
        if (monAge > 20) {
            estMajeur = true;
        } else {
            estMajeur = false;
        } 
        System.out.println("mon age est de " + monAge + " ans ");
        if (estMajeur) {
            System.out.println("Je suis majeur.");
        } else {
            System.out.println("Je ne suis pas encore majeur.");
        }
    }
}
