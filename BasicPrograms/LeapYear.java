import java.security.spec.EdDSAParameterSpec;
import java.util.Scanner;

public class LeapYear {

    //to find the leap or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println("Leap year..");
        }
        else {
            System.out.println("Not leap year...");
        }
    }
    
}
