package Recursion;

public class PrintNum {
    public static void printNum(int i) {
        if (i == 5) {
            System.out.print(i);
            return;
        }
    
        System.out.print(i + " ");
        printNum(i+1);
    }

    public static void main(String[] args) {
        printNum(1);
    }
}
