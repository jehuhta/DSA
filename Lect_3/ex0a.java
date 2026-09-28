 /* This is how you use a Dynamic LinkedList */

// LinkedList needs to be imported
import java.util.Collections;
import java.util.LinkedList;

public class ex0a {
    
    public static void main(String[] args) {

        // Create a linked list
        LinkedList<Integer> numbers = new LinkedList<>();

        // add numbers in the linked list 1-100
        for (int i = 1; i <= 25; i++) {
            numbers.add(i);
        }

        // Shuffle those numbers
        Collections.shuffle(numbers);

        // Print numbers list.
        System.out.println(numbers);
    }
}