import java.util.Scanner;

public class PrimeNum {

    static void primNum(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("The given number is prime number..");
        }
        else{
            System.out.println("The given number is not prime number..");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number..");
        int num = sc.nextInt();

        primNum(num);
    }
}
