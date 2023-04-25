public class AllPrimeNum {
    public static void main(String[] args) {
        int N = 45;
        prime_N(N);

    }

    private static void prime_N(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (i % i == 0 && i%1==0) {
                count++;
            }

            if (count == 2) {
                show(i);
            }
        }
    }

    static void show(int i) {
        System.out.println(i);
        return;
    }
}
