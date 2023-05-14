package Recursion;

import javax.swing.text.html.HTMLDocument.RunElement;

public class XpowNum
{

    public static int calPow(int x, int n){
        if(x == 0){
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        
        if (n % 2 == 0) {
            return calPow(x, n/2) * calPow(x, n/2);
        }
        else{
            
            return calPow(x, n / 2) * calPow(x, n / 2) * x;
        }
        
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int cal = calPow(x,n);
        System.out.println(cal);
    }
}
