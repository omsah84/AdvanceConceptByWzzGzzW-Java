import java.util.*;
import java.lang.*;
import java.io.*;


public class VowOrConso {

    //to check given character is vowel or consonant.

    static String voString(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            return "vowel";
        }

        else {
            return "consonant";
        }

    }
    
    //dive code
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        //taking char value
        System.out.println("Enter the character...");
        char c = bf.readLine().charAt(0);

        //return vowel or consonant
        String str = voString(c);


        //if str is vowel than print vowel otherwise print consonant.
        System.out.println(str == "vowel"? "vowel":"consonant");
    }
}
