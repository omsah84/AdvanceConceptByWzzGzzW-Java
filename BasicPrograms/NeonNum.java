import java.util.*;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import java.io.*;
import java.lang.*;


public class NeonNum {

    public static int square(int num) {
        return num * num;

    }
    
    static int sum(int sqr) {
        int sum = 0;

        while(sqr != 0) {
            int rem = sqr % 10;
            sum = sum + rem;
            sqr = sqr / 10;    
        }

        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number....");
        int num = sc.nextInt();

        int sqr = square(num);
        int sm = sum(sqr);
        if (num == sm) {
            System.out.println("this is neon number ...");
        }
        else {
            System.out.println("This is not newon number...");
        }
        
        
    }

}
