import java.util.*;
import java.io.*;

// java program to multiply two floating point numbers

//main class
public class FloatMlty {
        static class FunctionCode {
        float f1;
        float f2;
        
        FunctionCode(float f1, float f2) throws Exception{
            this.f1 = f1;
            this.f2 = f2;
            
            System.out.println("The floating value multiplication is: "+f1*f2);
        }


    }
    public static void main(String[] args) throws Exception{
        //creating object  of bufferedReader class
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        //taking floating data from user
        //first floating data and converting as a float
        System.out.println("Enter the floating value.");
        float f1 = Float.parseFloat(bf.readLine());
        
        //second floating data and converting as a float
        System.out.println("Enter the floating value.");
        float f2 = Float.parseFloat(bf.readLine());


        //object of function class
        FunctionCode ohh = new FunctionCode(f1, f2);
        // FunctionCode oh = new FunctionCode();
        
    }

    
}
