import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SI {

    private static double simpleInterest(double p, double t, double r) {
        return (p * t * r) / 100;
    }
    
    public static void main(String[] arr) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the amount...");
        double principal = Double.parseDouble(bf.readLine());

        System.out.println("Enter the time..");
        double time = Double.parseDouble(bf.readLine());

        System.out.println("Enter the rate..");
        double rate = Double.parseDouble(bf.readLine());

        System.out.println("The simple interest is: " + simpleInterest(principal, time, rate));

    }


}
