import java.util.Stack;

public class Revstringusingstack {
    public static void revesrr(String str) {
        Stack<Character> s = new Stack<>();
         String newstr ="";

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
            
        }

        while (!s.isEmpty()) {

            newstr = "" + s.pop();
            System.out.print(newstr);
        }
        
        
        
    }


    public static void main(String[] args) {
        String str = "omsah";
        // System.out.println(revesrr(str));
        revesrr(str);
        // revesrr(str);

    }
}
