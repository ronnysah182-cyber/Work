
/**
 * Write a description of class Mathoperators here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mathoperators{
    public static void main(String[] args){
        //Arithmetic operators
        int a=4;
        int b=8;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
        //Unary operator
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
        System.out.println(a+b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        int c=(a>b)?a:b;
        System.out.println(c);
}
}