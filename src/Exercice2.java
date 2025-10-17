void main() {
    Scanner scanner = new Scanner(System.in);

    IO.print("Combien de notes avez vous : ");
    int nombreNotes = scanner.nextInt();

    int num = 0;

    for (int i = 0; i < nombreNotes; i++) {
        IO.print("Quelle est votre note numéro " + (i + 1) + " : ");
        num = num + scanner.nextInt();
    }

    IO.print("Votre moyenne est de : " + num / nombreNotes + " !");


    scanner.close();
}



