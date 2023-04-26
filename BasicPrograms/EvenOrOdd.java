import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class EvenOrOdd {
    //to check even or odd function
    public void checkEvenOdd(int num) {

        if (num >= 0) {
            if (num % 2 == 0) {
                System.out.println("The given number is even: " + num);
            } else {
                System.out.println("The given number is odd: " + num);
            }

        }
        else {
            System.out.println("Invalid number...");
        }
        return;
        
    }
//main method 
    public static void main(String[] args) throws Exception{
        
        EvenOrOdd ob = new EvenOrOdd();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        ob.checkEvenOdd(Integer.parseInt(bf.readLine()));
        
    }
}
