
/**
 * Write a description of class C4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class C4{
    int age; // instance variable
    static int qty; // static variable
    public static void main(String[] args){
        int i=10; // local variable
        System.out.println(i);
        
        // Implicit Typecasting
        
        double db = i;
        System.out.println(db);
        
        //Explicit Typecasting
        
        double dtb= 10.09;
        int itr= (int)dtb;
        
        //Exceptions in arithmetic
        
        byte bt= 10;
        
        byte btr= 11;
        
        byte sum= (byte)(bt+btr);
        
        //Max, Min, Size and bytes
        
        System.out.println(Byte.MAX_VALUE); // return maximum value
        System.out.println(Byte.MIN_VALUE); // return minimum value
        System.out.println(Byte.SIZE); // return in bits
        System.out.println(Byte.BYTES); // return in bytes
        
        
        //Escape Sequence
        
        System.out.println("Hello\nWorld"); // new line
        System.out.println("Hamro\tNepal"); //tab
        System.out.println("She said \"Hi\""); // Double quotation
        
        // Unicode escape sequence
        
        System.out.println("\u2764");
        
    
}}

