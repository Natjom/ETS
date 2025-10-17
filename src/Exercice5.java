void main() {
    int[] tableau = {1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 20, 20, 21};
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
