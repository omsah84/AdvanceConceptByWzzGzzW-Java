import java.net.PortUnreachableException;

public class AddBinaryStr {

    //task dower
    public static void Fun(String str1, String str2) {

        //Converting String into binary
        int num1 = Integer.parseInt(str2, 2);
        int num2 = Integer.parseInt(str2, 2);

        //adding 
        int sum = num1 + num2;

        //converting integer into BinaryString 
        String result = Integer.toBinaryString(sum);

        //printing result
        System.out.println(result);


    }

    public static void main(String[] args) {
        //Binary string as like a input
        String str1 = "101010";
        String str2 = "100010";

        //calling function
        Fun(str1, str2);
        
    }
}
