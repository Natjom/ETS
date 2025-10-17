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
            System.out.print(" " + val + "  ");
            val = val * (i - j) / (j + 1);
        }
        System.out.println();
    }

    int i = n - 1;
    int val = 1;

    System.out.print("\nDéveloppement de (a + b)^" + i + " : ");
    for (int j = 0; j <= i; j++) {
        if (val != 1) System.out.print(val);
        if (i - j > 0) System.out.print("a" + (i - j > 1 ? "^" + (i - j) : ""));
        if (j > 0) System.out.print("b" + (j > 1 ? "^" + j : ""));
        if (j < i) System.out.print(" + ");
        val = val * (i - j) / (j + 1);
    }

    sc.close();

}