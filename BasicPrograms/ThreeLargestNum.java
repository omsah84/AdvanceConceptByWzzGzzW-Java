import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class ThreeLargestNum {

    public static void funCode(int a, int b, int c) {

        int trn = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.printf("The greater numebr is %d , %d and %d = %d. ", a, b, c, trn);
    }

    //method 2
    static void biggestOfThree(int x, int y, int z) {
        if (x >= y && x >= z) {
            System.out.println(x);
        } else if (y >= x && y >= z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

        return;
    }
    

    //using collection
    public static void coll(int a, int b, int c) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(a);
        arr.add(b);
        arr.add(c);

        System.out.println("The max value is: "+ Collections.max(arr));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number..");
        int num1 = sc.nextInt();

        System.out.println("Enter second number..");
        int num2 = sc.nextInt();

        System.out.println("Enter third number...");
        int num3 = sc.nextInt();

        funCode(num1, num2, num3);



        System.out.println("\nThis is method 2....");
        biggestOfThree(num1, num2, num3);

        System.out.println("This is method 3");
        coll(num1, num2, num3);
        
    }
}
