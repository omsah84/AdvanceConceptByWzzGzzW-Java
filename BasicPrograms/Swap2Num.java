import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Swap2Num {

    //method 1
    public void method1(int m, int n) {
        int thrd = m;
        m = n;
        n = thrd;
        System.out.println("The after swaping is " + m + " and values of " + n + ".");
    }
    
    //method 2
    public void method2(int m, int n) {
        m = m - n;
        n = m + n;
        m = n - m;

        System.out.printf("After swaping: %d and %d.", m, n);
        
    }
    
    //method 3
    public void method3(int m, int n) {
        
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.printf("After swaping: %d and %d.", m, n);
        

    }
    
    //driver code
    public static void main(String[] args) throws Exception{
        Swap2Num sp = new Swap2Num();

        //using bufferedReader class
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Enter first number is: ");
        int num1 = Integer.parseInt(bf.readLine());

        System.out.println("Enter the second number is: ");
        int num2 = Integer.parseInt(bf.readLine());

        System.out.println("The before swaping "+num1+" and " + num2);

        sp.method1(num1, num2);

        System.out.println("Second method.....");

        sp.method2(num1, num2);

        System.out.println("Third method...");
        sp.method3(num1, num2);
    }
    
}
