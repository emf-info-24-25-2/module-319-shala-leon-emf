public class Methodes {

    public static void direBonjour() {
        System.out.println("Boujour");
    }

    public static void direNimporteQuoi(String message) {
        System.out.println(message);
    }
// Toutes les valeurs 
    public static void main(String[] args) {
        direBonjour();
        direNimporteQuoi("Je mange des pommes");
        affichermin(10, 29);
        affichermax(10, 30);
        afficherpow(2, 3);
        afficherSqrt(16);
        afficherabs(-10);
    }

// le nombre min
public static void affichermin(int a, int b) {
    System.out.println("le min est " + Math.min(a, b));
}

// le nombre max
  public static void affichermax(int a, int b) {
    System.out.println("Le max est " + Math.max(a, b));
 }

 // le nombre pow
 public static void afficherpow(double base, double exposant) {
    System.out.println("la nombre " + base + " élevé a la puissance " + exposant + " est " + Math.pow(exposant, base));
 }

 // le nombre Sqrt
 public static void afficherSqrt(int nombre) {
    System.out.println("la rarine carré est de  " + nombre + " est " + Math.sqrt(nombre));
 }

 // le nombre abs
 public static void afficherabs(int nombre) {
    System.out.println("la valeur absolue est de " + nombre + " retourne à " + Math.abs(nombre));

 }
      
}