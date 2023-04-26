import java.util.Scanner;

public class AllPrimeNum {
    //driver code
    public static void main(String[] args) {
        //scanner class object
        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Enter the number..");
        int N = sc.nextInt();
        //function to calculate the all prime number.
        prime_N(N);

    }
    //function to print all prime number
    private static void prime_N(int n) {
        //prime number is start 2 and check upto N digit
        for (int i = 2; i <= n; i++) {
            //to check count if count number 2 than show prime number other wise not prime number 
            //because it divide itself and with 
            //so count will increase with 2 only if it increase by more than it mean
            //it is not prime number
            int count = 0;
            //dividing start by 1 to n.
            for (int j = 1; j <= n; j++) {
                if (i % j == 0 && i % 1 == 0) {
                    count++;
                }
            }
            //check count value is or not 
            //if 2 than print prime number
            if (count == 2) {
                //printing function
                show(i);
            }
        }
    }

    //display prime digit 
    static void show(int i) {
        System.out.print(i+" ");
        return;
    }
}
