import java.util.Scanner;

/**
 * Write a description of class NEW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NEW{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        
        int firstnum= input.nextInt();
        System.out.println("My first number:"+ firstnum );
        
        System.out.println("Enter second number");
        double secondnum= input.nextDouble();
        System.out.println("My second number is :" + secondnum);
        
        //Ternery Operator
        
        
    
        System.out.println("Ask for his/her age:");
        int age= input.nextInt();
        
        String isValid = (age >=18)? "Driving is allowed" : "Driving is not allowed";
        System.out.println(isValid);
        
        
    }}


