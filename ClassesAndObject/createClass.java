package ClassesAndObject;

public class createClass {
    int id; // data member (also instance variable)
    String name; // data member (also instance variable)
 
    public static void main(String args[])
    {
        createClass s1 = new createClass(); // creating an object of
                                    // Student
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
    
}
