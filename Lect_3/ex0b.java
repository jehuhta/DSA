 /* This is how you use a Dynamic TreeSet */

// TreeSet needs to be imported
import java.util.TreeSet;

public class ex0b {
    
    public static void main(String[] args) {

        // Create a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add numbers 1-25 to the TreeSet
        for (int i = 1; i <= 25; i++) {
            numbers.add(i);
        }

        // THIS doesn't work since TreeSets are ALWAYS ordered.
        Collections.shuffle(numbers);

        // Print numbers
        System.out.println(numbers);
    }
}