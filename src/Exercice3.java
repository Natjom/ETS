void main() {
    Scanner scanner = new Scanner(System.in);

    String[] noms = new String[100];
    int[] quantites = new int[100];
    double[] prix = new double[100];
    int nbProduits = 0;

    int choix;

    do {
        IO.println("\n=== MENU INVENTAIRE ===");
        IO.println("1. Ajouter un produit");
        IO.println("2. Rechercher un produit");
        IO.println("3. Modifier la quantité d’un produit");
        IO.println("4. Calculer la valeur totale de l’inventaire");
        IO.println("5. Afficher tous les produits");
        IO.println("6. Quitter");
        IO.print("Votre choix : ");
        choix = scanner.nextInt();
        scanner.nextLine();

        switch (choix) {
            case 1:
                if (nbProduits >= 100) {
                    IO.println("Inventaire plein !");
                    break;
                }
                IO.print("Nom du produit : ");
                String nom = scanner.nextLine();

                IO.print("Quantité : ");
                int qte = scanner.nextInt();
                if (qte < 0) {
                    IO.println("Erreur : quantité négative interdite.");
                    break;
                }

                IO.print("Prix unitaire : ");
                double p = scanner.nextDouble();
                if (p < 0) {
                    IO.println("Erreur : prix négatif interdit.");
                    break;
                }

                noms[nbProduits] = nom;
                quantites[nbProduits] = qte;
                prix[nbProduits] = p;
                nbProduits++;

                IO.println("Produit ajouté avec succès !");
                break;

            case 2:
                IO.print("Nom du produit à rechercher : ");
                String recherche = scanner.nextLine();
                boolean trouve = false;
                for (int i = 0; i < nbProduits; i++) {
                    if (noms[i].equalsIgnoreCase(recherche)) {
                        IO.println("→ " + noms[i] + " | Quantité : " + quantites[i] + " | Prix : " + prix[i] + "€");
                        trouve = true;
                        break;
                    }
                }
                if (!trouve) {
                    IO.println("Produit non trouvé.");
                }
                break;

            case 3:
                IO.print("Nom du produit à modifier : ");
                String modif = scanner.nextLine();
                boolean modifie = false;
                for (int i = 0; i < nbProduits; i++) {
                    if (noms[i].equalsIgnoreCase(modif)) {
                        IO.print("Nouvelle quantité : ");
                        int nouvelleQte = scanner.nextInt();
                        if (nouvelleQte < 0) {
                            IO.println("Erreur : quantité négative interdite.");
                        } else {
                            quantites[i] = nouvelleQte;
                            IO.println("Quantité mise à jour !");
                        }
                        modifie = true;
                        break;
                    }
                }
                if (!modifie) {
                    IO.println("Produit non trouvé.");
                }
                break;

            case 4:
                double total = 0;
                for (int i = 0; i < nbProduits; i++) {
                    total += quantites[i] * prix[i];
                }
                IO.println("Valeur totale de l’inventaire : " + total + "€");
                break;

            case 5:
                if (nbProduits == 0) {
                    IO.println("Aucun produit enregistré.");
                } else {
                    IO.println("\n--- Liste des produits ---");
                    for (int i = 0; i < nbProduits; i++) {
                        IO.println((i + 1) + ". " + noms[i] + " | Quantité : " + quantites[i] + " | Prix : " + prix[i] + "€");
                    }
                }
                break;

            case 6:
                IO.println("Fermeture du programme...");
                break;

            default:
                IO.println("Choix invalide. Veuillez recommencer.");
        }

    } while (choix != 6);

    scanner.close();
}

