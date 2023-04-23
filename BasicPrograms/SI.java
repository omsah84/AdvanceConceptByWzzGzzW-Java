import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SI {


    //calculating simple interest 
    private static double simpleInterest(double p, double t, double r) {
        return (p * t * r) / 100;
    }

    //driver code
    public static void main(String[] arr) throws Exception {

        //using buffered reader class
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        //taking input from user as a amount
        System.out.println("Enter the amount...");
        double principal = Double.parseDouble(bf.readLine());

        //time 
        System.out.println("Enter the time..");
        double time = Double.parseDouble(bf.readLine());

        //rate
        System.out.println("Enter the rate..");
        double rate = Double.parseDouble(bf.readLine());

        //calling simple interest funcition it will return SI.
        System.out.println("The simple interest is: " + simpleInterest(principal, time, rate));


        return;
    }


}
