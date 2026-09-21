
// class
public class Fibonnacci {

    // constructor
    public Fibonnacci() {

    }

    // method
    public int fibonnacci(int n) 
    {
        // base case
        if (n == 1 || n == 0)
        {
            return n;
        }

        // recursion
        return fibonnacci(n - 1) + fibonnacci(n - 2);
    }
    
    // main
    public static void main(String[] args) {
        Fibonnacci fibonnacci = new Fibonnacci();
        System.out.println(fibonnacci.fibonnacci(3));
    }

}