/*
Séveloppez un système de gestion simplifiée d’inventaire qui :
    Gère un tableau de produits (nom, quantité, prix)
    Propose un menu avec les options :
        Ajouter un produit
        Rechercher un produit
        Modifier la quantité d’un produit
        Calculer la valeur totale de l’inventaire
        Afficher tous les produits
        Quitter
    Valide les données saisies
    Gère les cas d’erreur (produit non trouvé, quantité négative, etc.)
*/

import java.util.Scanner;
public class Exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] noms = new String[100];
        int[] quantites = new int[100];
        double[] prix = new double[100];
        int nbProduits = 0;

        int choix;

        do {
            System.out.println("\n=== MENU INVENTAIRE ===");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Rechercher un produit");
            System.out.println("3. Modifier la quantité d’un produit");
            System.out.println("4. Calculer la valeur totale de l’inventaire");
            System.out.println("5. Afficher tous les produits");
            System.out.println("6. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    if (nbProduits >= 100) {
                        System.out.println("Inventaire plein !");
                        break;
                    }
                    System.out.print("Nom du produit : ");
                    String nom = scanner.nextLine();

                    System.out.print("Quantité : ");
                    int qte = scanner.nextInt();
                    if (qte < 0) {
                        System.out.println("Erreur : quantité négative interdite.");
                        break;
                    }

                    System.out.print("Prix unitaire : ");
                    double p = scanner.nextDouble();
                    if (p < 0) {
                        System.out.println("Erreur : prix négatif interdit.");
                        break;
                    }

                    noms[nbProduits] = nom;
                    quantites[nbProduits] = qte;
                    prix[nbProduits] = p;
                    nbProduits++;

                    System.out.println("Produit ajouté avec succès !");
                    break;

                case 2:
                    System.out.print("Nom du produit à rechercher : ");
                    String recherche = scanner.nextLine();
                    boolean trouve = false;
                    for (int i = 0; i < nbProduits; i++) {
                        if (noms[i].equalsIgnoreCase(recherche)) {
                            System.out.println("→ " + noms[i] + " | Quantité : " + quantites[i] + " | Prix : " + prix[i] + "€");
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Produit non trouvé.");
                    }
                    break;

                case 3:
                    System.out.print("Nom du produit à modifier : ");
                    String modif = scanner.nextLine();
                    boolean modifie = false;
                    for (int i = 0; i < nbProduits; i++) {
                        if (noms[i].equalsIgnoreCase(modif)) {
                            System.out.print("Nouvelle quantité : ");
                            int nouvelleQte = scanner.nextInt();
                            if (nouvelleQte < 0) {
                                System.out.println("Erreur : quantité négative interdite.");
                            } else {
                                quantites[i] = nouvelleQte;
                                System.out.println("Quantité mise à jour !");
                            }
                            modifie = true;
                            break;
                        }
                    }
                    if (!modifie) {
                        System.out.println("Produit non trouvé.");
                    }
                    break;

                case 4:
                    double total = 0;
                    for (int i = 0; i < nbProduits; i++) {
                        total += quantites[i] * prix[i];
                    }
                    System.out.println("Valeur totale de l’inventaire : " + total + "€");
                    break;

                case 5:
                    if (nbProduits == 0) {
                        System.out.println("Aucun produit enregistré.");
                    } else {
                        System.out.println("\n--- Liste des produits ---");
                        for (int i = 0; i < nbProduits; i++) {
                            System.out.println((i + 1) + ". " + noms[i] + " | Quantité : " + quantites[i] + " | Prix : " + prix[i] + "€");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Fermeture du programme...");
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez recommencer.");
            }

        } while (choix != 6);

        scanner.close();
    }
}

