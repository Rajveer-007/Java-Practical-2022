import java.util.*;

public class Prog2222 {
    public static void main(String[] args) {
        String str = "Hello!";
        System.out.println("Lenth of the string " +str+ " is : " +str.length());
        System.out.println("Character at index 4 is : " +str.charAt(4));
        System.out.println("String str in Uppercase: " +str.toUpperCase());
        System.out.println("String str in Lowercase: " +str.toLowerCase());

        // StringBuffer 
        StringBuffer str1 = new StringBuffer("Java Programming!");
        System.out.println("Lenth of the str1: " +str1.length());
        System.out.println("str1 after Replacing \"Java\" with \"C\" : " +str1.replace(0, 4, "C"));
        System.out.println("string str1 deleting \"C\" : " +str1.delete(0, 1));
        System.out.println("Reversing string str1: " +str1.reverse());
    }
}
