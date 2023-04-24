import java.util.Scanner;

public class GCD {

    static void gcd(int a, int b){
        int gc=0;
        for (int i = 1; i <= a && i<=b; i++) {
            if (i % a == 0 && i % b == 0) {
                gc = i;
            }
        }
            
        System.out.println("The GCD: "+gc);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number..");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number..");
        int num2 = sc.nextInt();
        gcd(num1, num2);
    }}
