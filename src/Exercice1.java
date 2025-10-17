import java.util.Scanner;

public class Exercice1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        System.out.println("Bienvenue, " + nom + " !");

        if (age >= 18) {
            System.out.println("Vous êtes majeur(e)");
        } else {
            System.out.println("Vous êtes mineur(e)");
        }

        scanner.close();
    }
}