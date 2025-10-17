void main() {
    int[] tableau = {1, 2, 2, 2, 3, 4, 5};
    System.out.println(rechPremOcc(tableau, 2));
}

public static int rechPremOcc(int[] tableau, int N) {
    int g = 0;
    int d = tableau.length - 1;
    int resultat = -1;

    while (g <= d) {
        int m = (g + d) / 2;

        if (tableau[m] == N) {
            resultat = m;
            d = m - 1;
        } else if (tableau[m] < N) {
            g = m + 1;
        } else {
            d = m - 1;
        }
    }

    return resultat;
}
