package ConversionPrograms;

public class BTO {
    static int decimalToOctal(long binary) {
        int decimalNumber = binaryToDecimalNUmber(binary);

        String OctalString = Integer.toOctalString(decimalNumber);
        int octalNumber = Integer.parseInt(OctalString);

        return octalNumber;

    }

    static int binaryToDecimalNUmber(long binary) {
        int decimalNumber = 0, i = 0;
        while (binary > 0) {
            decimalNumber += Math.pow(2, i++) * (binary % 10);
            binary /= 10;

        }
        return decimalNumber;
    }
    public static void main(String[] args) {
        System.out.println("Octal number: "+decimalToOctal(10101001));
    }
    
}
