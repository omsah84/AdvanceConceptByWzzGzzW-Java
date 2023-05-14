package Recursion;

public class XpowN {

    public static int calcul(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        
        int xpow = calcul(x, n - 1);
        int cal = x * xpow;
        return cal;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int cal = calcul(x, n);
        System.out.println(cal);
    }
}
