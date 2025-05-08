import java.util.Scanner;  // Import Scanner for user input

class BoolPattern {
    private int n;  // Member variable to store the number

    // Constructor to initialize 'n'
    public BoolPattern(int n) {
        this.n = n;
    }

    // Method to display the binary equivalent of the given decimal number
    void generatePatterns() {
        System.out.println("Binary equivalent: " + Integer.toBinaryString(n));  
        System.out.println("----------------");
    }
}

public class Polymorphism1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);  // Scanner for user input
        System.out.println("TANSIHK NR MAMODIA");
        System.out.print("Enter a decimal number: ");
        int n = scanner.nextInt();  // Read user input

        BoolPattern bp = new BoolPattern(n);  // Create an object using the constructor
        bp.generatePatterns();  // Call the method to display the binary equivalent

        scanner.close();  // Close the scanner
    }
}
