import java.net.SocketTimeoutException;
import java.util.Scanner;

public class EvenSumFibo {

    static int evensumfib(int num) {
        int add= 0;
        int a = 0;
        System.out.println("The fib series: "+a);
        
        int b = 1;
        System.out.println("The fib series: "+b);
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println("The fib series: " + sum);
            if (sum % 2 == 0) {
                add = add + sum;
            }
        }
        
        return add;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        int add = evensumfib(num);
        System.out.println("The sum of even fin series is: "+ add);
       
    }
}
