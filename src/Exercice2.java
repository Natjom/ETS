// Questions d’analyse :

// Quelle structure répétitive convient le mieux : POUR, TANT QUE, ou REPETER...JUSQU’ A ?
// POUR

// Justifiez votre choix
// Flemme, c'est de la logique en fait : Un while est trop gourmand alors qu'un pour est précis tu peux faire un "POUR NOMBRENOTESENTREES" fin bref

// Identifiez les variables nécessaires et leur rôle
// Un stockage des notes et le nombre de notes c'est tout (et aussi la "variable lue temporaire mais ça dépend du language)

// Proposez l’algorithme complet
// Voici :

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Combien de notes avez vous : ");
        int nombreNotes = scanner.nextInt();

        int num = 0;

        for (int i = 0; i < nombreNotes; i++) {
            System.out.print("Quelle est votre note numéro " +  (i + 1) + " : ");
            num = num + scanner.nextInt();
        }

        System.out.print("Votre moyenne est de : " + num/nombreNotes + " !");



        scanner.close();
    }
}



