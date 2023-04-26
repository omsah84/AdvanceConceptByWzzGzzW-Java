import java.util.Scanner;

public class FibonSeries {

    //task function
    static void fibo(int num, int a, int b, int i) {

        //cornal case
        if (i == num) {
            return;
        }

        int sum = a + b;
        a = b;
        b = sum;
        System.out.print(sum + " ");

        //calling itself
        fibo(num, a, b, i + 1);

    }
    
    //drive code
    public static void main(String[] args) {
        //class 
        Scanner sc = new Scanner(System.in);

        //input from user
        System.out.println("Enter the number..");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        //for coranl case
        int i = 2;
        //formating syntax
        System.out.printf("%d %d ", a, b);
        //calling task dower
        fibo(num,a,b,i);
    }
}
