import java.util.Scanner;
/**
 * Write a description of class q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter water level in litre: ");
        float waterlevel=input.nextFloat();
        System.out.println("Your water level in litre is: "+waterlevel);
        String display=(waterlevel>=1000)?"Warning:Water level has reached 1000L or more":"Status:NORMAL";
        System.out.println(display);
    

}}