// This is an example of recursion
// Recursion essentially is a function that calls itself.

public class recursionEx1 {

    static void countDown(int n) {
        System.out.println(n);

        // Notice how it calls itself by printing the line and then incrementing down by 1.
        // THAT is recursion.
        if (n > 0) {
            countDown(n - 1);
        }
    }

    public static void main(String[] args) {
        countDown(3);
    }

}
