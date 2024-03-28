// Group 4
// Rodje Andrei Arlegui
// John Cee S. Gumera
// Charles Stephen A. Lalata
// Jeremy Rivas
// Case Study #1

import java.util.Scanner;

public class GR4CaseStudy1 {
    // Display user menu and return the selected problem number
    public static void get_problem() {
        System.out.println("\nEnter the number of the problem you wish to solve.");
        System.out.println("    GIVEN A MEDICAL ORDER IN\t\t\tCALCULATE RATE IN");
        System.out.println("(1) ml/hr & tubing drop factor\t\t\t drops / min");
        System.out.println("(2) 1 L for n hr\t\t\t\t ml / hr");
        System.out.println("(3) mg/kg/hr & concentration in mg/ml\t\t ml / hr");
        System.out.println("(4) units/hr & concentration in units/ml\t ml / hr");
        System.out.println("(5) QUIT");
    }

    // Solve and display drop rate per minute based on rate in ml/hr and drop factor
    public static void fig_drops_min(int mlPerHour, int dropsPerML) {
        double result = dropsPerML * mlPerHour / 60.0;
        int roundedResult = (int) Math.round(result);
        System.out.println("The drop rate per minute is " + roundedResult + ".");
    }

    // Solve and display rate in milliliters per hour based on number of hours
    public static void fig_ml_hr(double numberOfHours) {
        int volumeInLiters = 1; //given volume in liters (1 liter in milliliters)
        double rateInMLPerHour = (volumeInLiters * 1000) / numberOfHours;
        int roundedResult = (int) Math.round(rateInMLPerHour);
        System.out.println("The rate in milliliters per hour is " + roundedResult + ".");
    }

    // Solve and display rate in milliliters per hour based on rate in mg/kg/hr, patient weight, and concentration
    public static void by_weight(double rateInMgKgHr, double patientWeightInKg, double concentrationInMgMl) {
        double rateInMLPerHour = (rateInMgKgHr * patientWeightInKg) / concentrationInMgMl;
        int roundedResult = (int) Math.round(rateInMLPerHour);
        System.out.println("The rate in milliliters per hour is " + roundedResult + ".");
    }

    // solve and display rate in milliliters per hour based on rate in units/hr and concentration in units/ml
    public static void by_units(int rateInUnitsPerHour, int concentrationInUnitsPerMl) {
        double rateInMLPerHour = (double) rateInUnitsPerHour / concentrationInUnitsPerMl;
        int roundedResult = (int) Math.round(rateInMLPerHour);
        System.out.println("The rate in milliliters per hour is " + roundedResult + ".");
    }

    // Ask the user to input rate in ml/hr and tubing's drop factor, then solve and display drop rate per minute
    public static void get_rate_drop_factor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rate in ml/hr=> ");
        int mlPerHour = scanner.nextInt();

        System.out.print("Enter tubing's drop factor (drops/ml)=> ");
        int dropsPerML = scanner.nextInt();

        fig_drops_min(mlPerHour, dropsPerML);

        scanner.close();
    }

    // Asks the user to input rate in mg/kg/hr, patient weight in kg, and concentration in mg/ml, then solve and display rate in ml/hr
    public static void get_kg_rate_conc() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rate in mg/kg/hr=> ");
        double rateInMgKgHr = scanner.nextDouble();

        System.out.print("Enter patient weight in kg=> ");
        double patientWeightInKg = scanner.nextDouble();

        System.out.print("Enter concentration in mg/ml=> ");
        double concentrationInMgMl = scanner.nextDouble();

        by_weight(rateInMgKgHr, patientWeightInKg, concentrationInMgMl);

        scanner.close();
    }

    // Asks the user to input rate in units/hr and concentration in units/ml, then solve and display rate in ml/hr
    public static void get_units_conc() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rate in units/hr=> ");
        int rateInUnitsPerHour = scanner.nextInt();

        System.out.print("Enter concentration in units/ml=> ");
        int concentrationInUnitsPerMl = scanner.nextInt();

        by_units(rateInUnitsPerHour, concentrationInUnitsPerMl);

        scanner.close();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INTRAVENOUS RATE ASSISTANT"); // Display program title
        
        // Display user menu and get the selected problem number
        get_problem();
        
        // Based on the user selected problem, execute corresponding functionality
        System.out.print("Problem => ");
        int problem = scanner.nextInt();

        switch (problem) {
            case 1:
                get_rate_drop_factor();
                break;
            case 2:
                System.out.print("Enter number of hours=> ");
                double numberOfHours = scanner.nextDouble();
                fig_ml_hr(numberOfHours); // Solve and display rate in milliliters per hour based on given number of hours
                break;
            case 3:
                get_kg_rate_conc(); // Asks user for rate in mg/kg/hr, patient weight in kg, and concentration in mg/ml, then calculate and display rate in ml/hr
                break;
            case 4:
                get_units_conc(); // Asks user for rate in units/hr and concentration in units/ml, then solve and display rate in ml/hr
                break;
            default:
                break;
        }
        scanner.close();
    }
}
