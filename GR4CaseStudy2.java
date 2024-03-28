// Group 4
// Rodje Andrei Arlegui
// John Cee S. Gumera
// Charles Stephen A. Lalata
// Jeremy Rivas
// Case Study #2

import java.util.Scanner;

public class GR4CaseStudy2 {
    
    // Method to get the user's choice of conversion
    private static int getProblem(Scanner scanner) {
        System.out.println("\nSelect the form that you would like to convert to slope-intercept form:");
        System.out.println("1) Two-point form (you know the points on the line)");
        System.out.println("2) Point-slope form (you know the line's slope and one point)");
        System.out.print("=> ");
        return scanner.nextInt();
    }

    // Method to get input for two-point form conversion
    private static void get2_pt(Scanner scanner) {
        int x1, y1, x2, y2;
        System.out.print("\nEnter the x-y coordinates of the first point separated by a space=> \n");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        System.out.println("Enter the x-y coordinates of the second point separated by a space=> ");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        // Calculate slope and y-intercept
        double m = slope_intcpt_from2_pt(x1, y1, x2, y2);
        double b = intcpt_from_pt_slope(x1, y1, m);

        // Display the result
        display2_pt(x1, y1, x2, y2);
        display_slope_intcpt(m, b);
    }

    // Method to get input for point-slope form conversion
    private static void get_pt_slope(Scanner scanner) {
        double slope;
        int x, y;
        System.out.print("\nEnter the slope=> ");
        slope = scanner.nextDouble();
        System.out.print("Enter the x-y coordinates of the point separated by a space=> ");
        x = scanner.nextInt();
        y = scanner.nextInt();

        // Calculate y-intercept
        double b = intcpt_from_pt_slope(x, y, slope);

        // Display the result
        display_pt_slope(x, y, slope);
        display_slope_intcpt(slope, b);
    }

    // Method to calculate slope from two points
    private static double slope_intcpt_from2_pt(int x1, int y1, int x2, int y2) {
        return (double) (y2 - y1) / (x2 - x1);
    }

    // Method to calculate y-intercept from a point and slope
    private static double intcpt_from_pt_slope(int x, int y, double slope) {
        return y - slope * x;
    }

    // Method to display two-point form
    private static void display2_pt(double x1, double y1, double x2, double y2) {
        System.out.println("\nTwo-point form");
        System.out.printf("     (%.2f - %.2f)\n", y2, y1);
        System.out.println("m = ----------------");
        System.out.printf("     (%.2f - %.2f)\n", x2, x1);
    }

    // Method to display point-slope form
    private static void display_pt_slope(double x, double y, double slope) {
        System.out.println("\nPoint-slope form");
        System.out.printf("\ty - %.2f = %.2f (x - %.2f)", y, slope, x);
    }

    // Method to display slope-intercept form
    private static void display_slope_intcpt(double slope, double intercept) {
        System.out.println("\nSlope-intercept form");
        if (intercept >= 0) {
            System.out.printf("\ty = %.2fx + %.2f\n", slope, intercept);
        } else {
            System.out.printf("\ty = %.2fx - %.2f\n", slope, Math.abs(intercept));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char doAnotherConversion = 'Y';

        // Loop until the user chooses to exit
        while (doAnotherConversion == 'Y' || doAnotherConversion == 'y') {
            int problemNumber = getProblem(scanner); // Get the user's choice

            // Perform the selected conversion
            switch (problemNumber) {
                case 1:
                    get2_pt(scanner); // Two-point form
                    break;
                case 2:
                    get_pt_slope(scanner); // Point-slope form
                    break;
                default:
                    System.out.println("Invalid input. Please select 1 or 2.");
            }

            // Ask the user if they want to do another conversion
            System.out.print("\nDo another conversion (Y or N)=> ");
            doAnotherConversion = scanner.next().charAt(0);
        }

        // Print a message when the program ends
        System.out.println("Program terminated.");
    }
}
