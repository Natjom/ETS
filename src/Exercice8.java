void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Combien de lignes : ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i; j++) {
            System.out.print("  ");
        }

        int val = 1;
        for (int j = 0; j <= i; j++) {
            System.out.printf("%3s ", Integer.toHexString(val).toUpperCase());
            val = val * (i - j) / (j + 1);
        }
        System.out.println();
    }

    sc.close();

}