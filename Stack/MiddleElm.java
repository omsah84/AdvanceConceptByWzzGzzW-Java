import java.util.Stack;

public class MiddleElm {

     
    static void middleelement(Stack<Integer> s, int size, int count,int realsize) {
        if (realsize % 2 == 0) {
            if (size == count) {
                System.out.println("first middle element is: " + s.peek());
                s.pop();
                System.out.println("second middle element is: " + s.peek());
                s.pop();
                return;
            }
            int top = s.pop();
            middleelement(s, size, count + 1 , realsize);
            s.push(top);
            return;

        }
        
        else {
            if (size == count) {
                System.out.println("this middle element is: " + s.peek());
                s.pop();
                return;
            }
            int top = s.pop();
            middleelement(s, size, count + 1,realsize );
            s.push(top);
            
        }
        

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        
        int realsize = s.size();
        int size = s.size()/2;
        size= size+1;
        middleelement(s, size, 1 ,realsize);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
