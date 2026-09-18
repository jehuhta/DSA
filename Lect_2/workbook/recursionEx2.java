// One great solution for recrusion is factorials.

// Factorials 
// Factorial of three: 3 * 2 * 1 = 6
// Factorial of four:  4 * 3 * 2 * 1 = 24

public class recursionEx2 {

    static int factorial(int n) {

        // If a factorial of 0 exists, mathematically it is 1.
        // This must exist or it will give an incorrect answer.
        if (n == 0) {
            return 1;
        }

        // Otherwise, we calculate the number recursively. 
        // If n = 4...
        // factorial(4) = 4 * (factorial(3) * (factorial(2) * (factorial(1))))
        return n * factorial(n - 1); 
        // It loops around itself until it reaches the correct answer! 
    }

    // MAIN
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
}