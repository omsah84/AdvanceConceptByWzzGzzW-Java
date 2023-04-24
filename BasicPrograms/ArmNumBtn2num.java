import java.util.*;
import java.io.*;
import java.lang.*;

public class ArmNumBtn2num {

    static void armStrongNum(int num1, int num2) {
        if (num1 > 0 && num2 > 1) {
            for (int i = num1 + 1; i < num2; i++) {
                int sum = findarm(i);
                if (sum == i) {
                    show(sum);
                }

            }
        }
        
        else {
            System.out.println("Enter greater than 0,1...");
        }

        return;
    }
    
    static int findarm(int i) {
        // int originalNum = i;
        int sum = 0;

        while (i != 0) {
            int rem = i % 10;
            int cube = cub(rem);

            sum = sum + cube;

            i = i / 10;
        }

        return sum;

    }

    static int cub(int rem) {
        return rem*rem*rem;
        
    }
    
    static void show(int num) {
        System.out.print(num+" ");
        return;
    }

    public static void main(String[] args) throws Exception {

        while (true) {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
            System.out.println("Enter the first number..");
            int num1 = Integer.parseInt(bf.readLine());
            
            System.out.println("Enter the second number..");
            int num2 = Integer.parseInt(bf.readLine());

            System.out.print("The armstrong number is: ");
            armStrongNum(num1, num2);

            System.out.println("\n===================");
                
        }
    }
}
