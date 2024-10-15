public class StarTriangleReverse {
    public static void main(String[] args) {
        // Outer loop for the number of lines
        for (int i = 5; i >= 1; i--) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print star followed by a space
            }
            System.out.println(); // Move to the next line after printing stars
        }
    }
}
