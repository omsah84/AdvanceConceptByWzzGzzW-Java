import java.util.*;

public class SortStackUsingRec {
    public static void sorted(Stack<Integer> s,int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        
        int top = s.pop();
        if (top > data) {
            s.push(data);
        }
        
        sorted(s, data);
        s.push(top);
        
    }

    static void sortedFun(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        sortedFun(s);
        sorted(s,top);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(4);
        s.push(9);
        s.push(0);
        s.push(3);

        sortedFun(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
                
            
        }

    }
}
