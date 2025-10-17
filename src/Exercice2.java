
// Analysez le problème suivant et choisissez la structure de contrôle la plus appropriée :
// Problème : Créer un programme qui calcule la moyenne des notes d’un étudiant.
// Le nombre de notes n’est pas connu à l’avance, et l’utilisateur saisit pour terminer la saisie.

// Questions d’analyse :
// Quelle structure répétitive convient le mieux : POUR, TANT QUE, ou REPETER...JUSQU’ A ?
// Justifiez votre choix
// Identifiez les variables nécessaires et leur rôle
// Proposez l’algorithme complet

import java.util.Scanner;

public class Exercice2 {

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
