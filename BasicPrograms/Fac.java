import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Fac {
    static void fac(int num) {
        int sum = 1;
        if (num == 0 || num==1) {
            System.out.println("The factorial is : 1");
        }
        else 
        {
            for (int i = 2; i <= num; i++) {
                sum = sum * i;
            }
            System.out.println("The factorial is : "+sum);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number..");
            int num = sc.nextInt();
            fac(num);
            System.out.println("==============================");
            
        }
    }
    
}
