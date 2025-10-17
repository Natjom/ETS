void main() {
    int n = 5;
    Random r = new Random();

    var t1 = r.ints(0, 100).distinct().limit(n).sorted().toArray();
    var t2 = r.ints(0, 100).filter(x -> Arrays.stream(t1).noneMatch(y -> y == x)).distinct().limit(n).sorted().toArray();

    System.out.println(Arrays.toString(t1));
    System.out.println(Arrays.toString(t2));


    var t3 = new int[2 * n];
    int i = 0, j = 0, k = 0;

    while(i < n && j < n) {
        if(t1[i] < t2[j]) t3[k++] = t1[i++];
        else t3[k++] = t2[j++];
    }

    while(i < n) t3[k++] = t1[i++];
    while(j < n) t3[k++] = t2[j++];

    System.out.println(Arrays.toString(t3));

}
