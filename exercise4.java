import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        //creating a scanner
        Scanner scanner = new Scanner(System.in);

        //Asking the user to enter hourly rate 
        System.out.print("Hourly rate: "); 
        double hourRate = scanner.nextDouble(); 
        
        //Asking the user to enter number of hours worked 
        System.out.print("Hours worked: "); 
        int hourWork = scanner.nextInt();

        //Calculating the Gross Pay 
        double grossPay = hourRate * hourWork; 
        
        //Calculating the withholding tax 
        double withholdingTax = 0.15 * grossPay; 
        
        //Calculating the net pay 
        double netPay = grossPay - withholdingTax; 
        
        //Display the gross pay, withholding tax, and net pay 
        System.out.println("\nGross pay: " + grossPay); 
        System.out.println("Withholding tax: " + withholdingTax); 
        System.out.println("Net pay: " + String.format("%.3f",netPay)); 
        
        //closing scanner 
        scanner.close();
    }
}
