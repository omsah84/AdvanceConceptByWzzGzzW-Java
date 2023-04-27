package StringPrograms;

public class String1 {
    public static char
    getCharFromString(String str, int index)
    {
        return str.charAt(index);
    }
  
    // Driver code
    public static void main(String[] args)
    {
  
        // Get the String
        String str = "GeeksForGeeks";
  
        // Get the index
        int index = 5;
  
        // Get the specific character
        char ch = getCharFromString(str, index);
  
        System.out.println("Character from " + str
                           + " at index " + index
                           + " is " + ch);
    }
    
}
