import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonalService personalService = new PersonalService();

        Utilizator utilizator1 = new Utilizator("John", "Doe", "john.doe@example.com", "password");
        PersonalAeroportuar personal1 = new PersonalAeroportuar("Alice", "Smith", "alice.smith@example.com", "password", "12345", "Security Officer");

        personalService.adaugaUtilizator(utilizator1);
        personalService.adaugaPersonalAeroportuar(personal1);

        Utilizator utilizatorAutentificat = autentificareUtilizator(personalService);
        if (utilizatorAutentificat != null) {
            System.out.println("Autentificare cu succes! Bine ai venit, " + utilizatorAutentificat.getNume() + "!");
        } else {
            System.out.println("Autentificare eșuată! Nume de utilizator sau parolă incorectă.");
            return;
        }

        afisareMeniu();
        int optiune;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Introdu opțiunea dorită: ");
            optiune = scanner.nextInt();
            switch (optiune) {
                case 1:
                    personalService.afiseazaTotiUtilizatorii();
                    break;
                case 2:
                    personalService.afiseazaToateZborurile();
                    break;
                case 0:
                    System.out.println("Aplicația se închide. La revedere!");
                    break;
                default:
                    System.out.println("Opțiune invalidă! Te rog să introduci o opțiune validă.");
                    break;
            }
        } while (optiune != 0);
        scanner.close();
    }

    private static Utilizator autentificareUtilizator(PersonalService personalService) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Autentificare utilizator:");
        System.out.print("Introdu numele de utilizator (email): ");
        String email = scanner.nextLine();
        System.out.print("Introdu parola: ");
        String parola = scanner.nextLine();

        for (Utilizator utilizator : personalService.getUtilizatori()) {
            if (utilizator.getEmail().equals(email) && utilizator.getParola().equals(parola)) {
                return utilizator;
            }
        }
        return null;
    }

    private static void afisareMeniu() {
        System.out.println("\n---- Meniu Principal ----");
        System.out.println("1. Afișează toți utilizatorii");
        System.out.println("2. Afișează toate zborurile");
        System.out.println("0. Ieșire");
    }
}
