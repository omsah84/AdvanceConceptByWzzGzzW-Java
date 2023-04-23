import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CI {
    //calculating compound interest
    static double compund(double p, double r, double t) {
        return p * (Math.pow((1 + r / 100), t));
    }

    //drive code
    public static void main(String[] args) throws Exception{
        BufferedReader oj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Principal amount..");
        double Prin = Double.parseDouble(oj.readLine());

        System.out.println("Enter the Rate...");
        double rate = Double.parseDouble(oj.readLine());

        System.out.println("Enter the time..");
        double time = Double.parseDouble(oj.readLine());

        System.out.println("The compound interest is: "+compund(Prin,rate,time));

        
    }
    
}
