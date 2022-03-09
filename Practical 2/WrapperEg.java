import java.util.*;
class WrapperEg{
    public static void main(String[] args) {
        // Unboxing
        Integer a = new Integer(3);
        int i = a.intValue();
        int j = a;
        System.out.println("a = " +a+ " i = " +i+ " j = " +j);
    
        // autoboxing
        int x = 25;
        Integer y = Integer.valueOf(x);
        Integer z = y;
        System.out.println("x = " +x+ " y = " +y+ " z = " +z);
    }
}
