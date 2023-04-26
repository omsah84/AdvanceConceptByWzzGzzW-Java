import java.io.*;
import java.util.*;
import java.lang.*;

public class LCM {
    //LCM
    static void lcm(int a, int b) {
        int i;
        int hg = a > b ? a : b;
        //example lcm of 3,6
        // mul = 3,6,9,12,15
        //mul = 6,12,18
        //lcm = 6
        for (i = hg; i < a * b; i += hg) {
            if (i % a == 0 && i % b == 0) {
                break;
            }
        }
        int lc = i;
        System.out.println("The LCM is: "+lc);
        
    }
//main method
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);
        //fist number
        System.out.println("Enter the first numebr..");
        int num1 = ob.nextInt();
        //seond number
        System.out.println("Enter the second number..");
        int num2 = ob.nextInt();

        lcm(num1, num2);
        
        
    }
}
