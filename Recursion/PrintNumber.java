package Recursion;

public class PrintNumber {

    public static void printNum(int i) {
        if (i == 0) {
            return;
        }

        System.out.print(i + " ");
        printNum(i-1);
    }
    public static void main(String[] args) {
        printNum(5);
    }
}
