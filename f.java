import java.util.Scanner;

public class f{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("     Aushadhi Pasal(Medicine store)     ");
         
        
        System.out.print("Medicine Name: ");
        String M1 = scanner.nextLine();
        System.out.print("Price per tablet : ");
        int price1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Quantity : ");
        int quantity1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Requires prescription? (1=Yes, 0=No): ");
        int prescription1 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter details for Medicine 2:");
        
        
        System.out.print("Medicine Name: ");
        String M2 = scanner.nextLine();
        System.out.print("Price per tablet : ");
        int price2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Quantity : ");
        int quantity2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Requires prescription? (1=Yes, 0=No): ");
        int prescription2 = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter details for Medicine 3:");
        
        
        System.out.print("Medicine Name: ");
        String M3 = scanner.nextLine();
        System.out.print("Price per tablet : ");
        int price3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Quantity in stock: ");
        int quantity3 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Requires prescription? (1=Yes, 0=No): ");
        int prescription3 = scanner.nextInt();
        scanner.nextLine();
        
        

        System.out.println("Medicine_Name\tPrice\t\tQuantity\tPrescription");

        System.out.println(M1 + "\t\t" + price1 + "\t\t" + quantity1 + "\t\t" + (prescription1 == 1 ? "Yes" : "No"));
        System.out.println(M2 + "\t\t" + price2 + "\t\t" + quantity2 + "\t\t" + (prescription2 == 1 ? "Yes" : "No"));
        System.out.println(M3 + "\t\t" + price3 + "\t\t" + quantity3 + "\t\t" + (prescription3 == 1 ? "Yes" : "No"));

        
       
    }
}