public class devoir04 {
    public static void main(String[] args) {
        // Déclaration des variables
        int year = 2024;  // Exemple de l'année actuelle
        int month = 11;   // Exemple du mois actuel
        int day = 12;     // Exemple du jour actuel

        // Vérification de l'année
        if (year < 0 || year > 9999) {
            System.out.println("L'année est invalide.");
            return;
        }

        // Vérification du mois
        if (month < 1 || month > 12) {
            System.out.println("Le mois est invalide.");
            return;
        }

        // Vérification du jour en fonction du mois
        boolean validDay = false;

        switch (month) {
            case 1: // Janvier
            case 3: // Mars
            case 5: // Mai
            case 7: // Juillet
            case 8: // Août
            case 10: // Octobre
            case 12: // Décembre
                if (day >= 1 && day <= 31) {
                    validDay = true;
                }
                break;
            case 4: // Avril
            case 6: // Juin
            case 9: // Septembre
            case 11: // Novembre
                if (day >= 1 && day <= 30) {
                    validDay = true;
                }
                break;
            case 2: // Février
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { // Année bissextile
                    if (day >= 1 && day <= 29) {
                        validDay = true;
                    }
                } else {
                    if (day >= 1 && day <= 28) {
                        validDay = true;
                    }
                }
                break;
            default:
                // Ce cas ne sera pas atteint, car la valeur de "month" est déjà vérifiée entre 1 et 12
                break;
        }

        if (!validDay) {
            System.out.println("Le jour est invalide.");
            return;
        }

        // Affichage de la date au format lisible
        String monthName = "";
        switch (month) {
            case 1: monthName = "Janvier"; break;
            case 2: monthName = "Février"; break;
            case 3: monthName = "Mars"; break;
            case 4: monthName = "Avril"; break;
            case 5: monthName = "Mai"; break;
            case 6: monthName = "Juin"; break;
            case 7: monthName = "Juillet"; break;
            case 8: monthName = "Août"; break;
            case 9: monthName = "Septembre"; break;
            case 10: monthName = "Octobre"; break;
            case 11: monthName = "Novembre"; break;
            case 12: monthName = "Décembre"; break;
        }

        System.out.println("Date valide : " + day + " " + monthName + " " + year);
    }
}