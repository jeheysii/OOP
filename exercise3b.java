public class exercise3b {
    public static void main(String[] args) {
        //variable declarations and initializations
        Boolean Sagot = true;
        int A = 2;
        int B = 4;
        char Letter = 'c';
        double Pi = 3.14;
        
        //printing the values of variables
        System.out.println("The value of A is " + A +  " while B is "+ B);
        System.out.println("Letter "+ Letter);
        System.out.println("Initial value of Sagot is " + Sagot);
        System.out.println("Pi contains the value " + Pi);

        //changing value of Sagot
        Sagot = false;
        System.out.println("Sagot is now " + Sagot);

        //determining if A is greater than B
        if (A > B) {
            System.out.println("A is greater than B");
        } else {
            System.out.println("A is not greater than B");
        }

        //displaying the product of A and B without declaring another variable
        System.out.println(A + " * " + B + " = " + (A * B));
    }
}