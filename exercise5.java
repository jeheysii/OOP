public class exercise5 {
    public static void main(String[] args) {
        //variable declarations and initializations
        int minsWorked = 125;

        //calculating hours and remaining minutes 
        int hours = minsWorked / 60; 
        int mins = minsWorked % 60; 
        
        // Displaying the given and converted time 
        System.out.println("\nGiven : " + minsWorked + " minutes"); 
        System.out.print("Converted hours: " + hours + " hours and " + mins + " minute/s"); 
    }
}
