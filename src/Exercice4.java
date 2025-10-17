import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Exercice4 {
    static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Quelle taille, le tableau : ");

        int i = sc.nextInt();

        int[] tableau = new int[i];

        for (int j = 0; j < i; j++) {tableau[j] = random.nextInt(1000);}

        System.out.println("1=selection 2=insertion 3=bulle");

        System.out.print("Quel tri : ");
        int typeTri = sc.nextInt();
        sc.close();
        System.out.print("Avant le tri : ");
        System.out.println(Arrays.toString(tableau));
        switch (typeTri) {
            case 1:
                System.out.print("Après tri par sélection : ");
                triSelection(tableau);
                break;
            case 2:
                System.out.print("Après tri par insertion : ");
                triInsertion(tableau);
                break;
            case 3:
                System.out.print("Après tri par bulle : ");
                triBulle(tableau);
                break;
            default:
                System.out.print("?");
                break;
        }
        System.out.println(Arrays.toString(tableau));
    }

    static void triSelection(int[] tableau) {
        int n = tableau.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (tableau[j] < tableau[min]) min = j;
            }
            if (!(min == i)) {
                int tmp = 0;
                tmp = tableau[i];
                tableau[i] = tableau[min];
                tableau[min] = tmp;
            }
        }
    }

    static void triInsertion(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            int x = tableau[i];
            int j = i;
            while (j > 0 && tableau[j - 1] > x) {
                tableau[j] = tableau[j - 1];
                j = j - 1;
            }
            tableau[j] = x;
        }
    }

    static void triBulle(int[] tableau) {
        for (int i = tableau.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (tableau[j+1] < tableau[j]) {
                    int tmp = tableau[j];
                    tableau[j] = tableau[j+1];
                    tableau[j+1] = tmp;
                }
            }
        }
    }
}







