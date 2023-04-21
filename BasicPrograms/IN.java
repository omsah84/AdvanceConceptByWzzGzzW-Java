import java.io.BufferedReader;
import java.io.*;
import java.util.Scanner;

//how to read and print an ingeger value in java

//main class
public class IN {


    //problem solution class
    static public class ForInput {

        {
            System.out.println("Standard input method...");
        }

        //constructor
        ForInput() {
            //declare variable for integer
            int num;

            //scanner class object for input taking
            Scanner sc = new Scanner(System.in);

            //read input from console
            System.out.print("Enter Integer data: ");
            num = sc.nextInt();

            //displaying integer value 
            System.out.println("The given input integer value is : " + num);

            System.out.println();

        }
    }


    // another method to take input form user 
    static public class ForInput1 {
        int num;

        //instance block
        {
            System.out.println("This is another method to take input form user using BufferedReader class...");
        }

        //constructor
        ForInput1() throws Exception{
            //using bufferedReader class object
            BufferedReader re = new BufferedReader(new InputStreamReader(System.in));

            //reading user data from console as a string and converting into integer using below method..
            System.out.print("Enter the Integer data: ");
            num = Integer.parseInt(re.readLine());

            //displaying input data
            System.out.println("The Integer data: "+num);

            
        }
        
    
 }

    //drive code
    public static void main(String[] args) throws Exception{

        //making object 
        //for method 1
        ForInput ob = new ForInput();

        //for method 2
        ForInput1 ob1 = new ForInput1();
        System.out.println();

        //this is another method
        System.out.println("Method 3..");
        System.out.println("Enter data..");
        System.out.println(System.console().readLine());
        
    }
}