import java.util.*;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import java.io.*;
import java.lang.*;


public class NeonNum {

    //return square of given number..
    public static int square(int num) {
        return num * num;
    }

    //return sum of digits given number
    static int sum(int sqr) {
        int sum = 0;

        while (sqr != 0) {
            int rem = sqr % 10;
            sum = sum + rem;
            sqr = sqr / 10;
        }

        return sum;
    }
    
    //drive code
    public static void main(String[] args) {
        //scanner class object
        Scanner sc = new Scanner(System.in);

        //taking number 
        System.out.println("Enter number....");
        int num = sc.nextInt();
        
        //storing square return value 
        int sqr = square(num);

        //storing sum of digits value
        int sm = sum(sqr);

        //check if original number is equal to sum of squrare digits  than print given number is neon number 
        if (num == sm) {
            System.out.println("this is neon number ...");
        }

        //other wise not neon number..
        else {
            System.out.println("This is not newon number...");
        }
        
    }

}
