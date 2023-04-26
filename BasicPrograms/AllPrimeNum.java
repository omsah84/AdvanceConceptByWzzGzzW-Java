import java.util.Scanner;

public class AllPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number..");
        int N = sc.nextInt();
        prime_N(N);

    }

    private static void prime_N(int n) {
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    count++;
                }      
            }
            if (count == 2) {
                show(i);
            }
        }
    }
    static void show(int i) {
        System.out.print(i+" ");
        return;
    }
}
