import java.util.Scanner;
/**
 * Write a description of class Wq2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wq2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int grade=input.nextInt();
        String result=(grade>=40)?"Pass":"Fail";
        System.out.println(result);
}
}