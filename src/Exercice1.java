void main() {
    Scanner scanner = new Scanner(System.in);

    IO.print("Entrez votre nom : ");
    String nom = scanner.nextLine();

    IO.print("Entrez votre âge : ");
    int age = scanner.nextInt();

    IO.println("Bienvenue, " + nom + " !");

    if (age >= 18) {
        IO.println("Vous êtes majeur(e)");
    } else {
        IO.println("Vous êtes mineur(e)");
    }

    scanner.close();
}