// This is an example of recursion
// Recursion essentially is a function that calls itself.


public class recursionEx1 {

    static void countDown(int n) {
        System.out.println(n);

        // Notice how it calls itself by printing the line and then incrementing down by 1.
        if (n > 0) {
            countDown(n - 1);
        }
    }

    // String[] args is kind of like a parameter you can add to main. In this case,
    // we're not using it. 
    public static void main(String[] args) {
        countDown(3);
    }

}