import java.io.*;
import java.util.*;
import java.lang.*;

public class ArmstrongNum {
    static boolean armFun(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;

            int cb = cub(rem);

            sum = sum + cb;
            num = num / 10;
        }

        if (sum == originalNum) {
            return true;
        } 
        else {
            return false;
        }

    }
    
    
    static int cub(int rem) {
        return rem * rem * rem;
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            
            //bufferReader class object
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
            System.out.println("Enter the number...");
            int num = Integer.parseInt(bf.readLine());
    
            boolean b = armFun(num);
    
            if (b == true) {
                System.out.println("Given number is Armstrong number");
            }
            else {
                System.out.println("Given number is not armstrong number..");
            }
            
            System.out.println("==================================");
        }
        
    }
}
