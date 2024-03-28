// Group 4
// Rodje Andrei Arlegui
// John Cee S. Gumera
// Charles Stephen A. Lalata
// Jeremy Rivas
// Case Study #3

import java.util.Scanner;

public class GR4CaseStudy3 {
    static int helperSearch(String color, String[] validColors, String target) {
        for (int i = 0; i < validColors.length; i++) {
            if (target.equals(validColors[i])) {
                return i;
            }
        }
        return -1; // Return -1 if color is not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] validColors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"};
        int b1Value, b2Value, b3Value;
        String b1, b2, b3;
        char decode = 'N'; // The decision is set automatically to default by putting 'N' it could be any letter just so that the condition can accept 'Y' as valid answer.

        do {
            System.out.println("\nEnter the colors of the resistor’s three bands, beginning with the band nearest the end. Type the colors in lowercase letters only, NO CAPS.");
            System.out.print("Band 1 => "); // Getting the color of the first band
            b1 = scanner.nextLine().trim().toLowerCase();

            System.out.print("Band 2 => "); // Getting the color of the second band
            b2 = scanner.nextLine().trim().toLowerCase();

            System.out.print("Band 3 => "); // Getting the color of the third band
            b3 = scanner.nextLine().trim().toLowerCase();

			// Getting the color values by the help of helperSearch
            b1Value = helperSearch(b1, validColors, b1);
            b2Value = helperSearch(b2, validColors, b2);
            b3Value = helperSearch(b3, validColors, b3);

            if (b1Value == -1 || b2Value == -1 || b3Value == -1) {
                if (b1Value == -1) {
                    System.out.println("Invalid color: " + b1); // Print if the color is not found on the array at helperSearch
                } 
                if (b2Value == -1) {
                    System.out.println("Invalid color: " + b2); // Print if the color is not found on the array at helperSearch
                }
                if (b3Value == -1) {
                    System.out.println("Invalid color: " + b3); // Print if the color is not found on the array at helperSearch
                }
                System.out.println("Do you want to decode another resistor?");
                System.out.print("=> ");//asking the user to do the computation again
                decode = scanner.nextLine().charAt(0);
                continue;
            }

            int ohms = (b1Value * 10 + b2Value) * (int) Math.pow(10, b3Value); // Solution to get the resistance value

            System.out.println("Resistance value: " + ohms / 1000 + " kilo-ohms");

            System.out.println("Do you want to decode another resistor?");
            System.out.print("=> ");
            decode = scanner.nextLine().charAt(0);

        } while (decode == 'Y' || decode == 'y'); // Using while loop, the program will be repeated as long as the decision is = 'Y' or 'y'
        scanner.close();
    }
}