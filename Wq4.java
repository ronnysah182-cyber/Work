
/**
 * Write a description of class Wq4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wq4{
    
    byte b;
    short s;
    int i;
    long l;
    double d;
    char c;
    boolean bo;
    float f;
    public static void main(String[] args){
        Wq4 value=new Wq4();
        System.out.println(value.b);
        System.out.println(value.s);
        System.out.println(value.i);
        System.out.println(value.l);
        System.out.println(value.d);
        System.out.println(value.c);
        System.out.println(value.bo);
        System.out.println(value.f);
        /*java doesn't assign default values to local variables but assigns to the global variables.If we try to assign default value to it throws complilation error.
        */
        
    }
    
}