import java.util.Scanner;

public class FibonSeries {

    //
    static void fibo(int num, int a, int b, int i) {

        if (i == num) {
            return;
        }

        int sum = a + b;
        a = b;
        b = sum;
        System.out.print(sum + " ");
        
        fibo(num, a, b,i+1);

                
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number..");
        int num = sc.nextInt();
        int i = 2;

        int a = 0;
        int b = 1;
        System.out.printf("%d %d ",a,b);

        fibo(num,a,b,i);
    }
}
