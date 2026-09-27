/* This is how you use an Dynamic ArrayList */

// ArrayList needs to be imported
import java.util.ArrayList;

public class lists3 {
    
    public static void main(String[] args) {

        // Creating a list array (dynamic, can shrink and grow as needed)
        ArrayList<String> animals = new ArrayList<>();

        // Adding elements to the array-list.
        animals.add("Dog");
        animals.add("Chicken");
        animals.add("Cat");


        System.out.println(animals);
        // Displaying the output in std-out.
        System.out.println(animals.get(0)); // Call your Doge

        animals.remove(0); // Remove dog, which is an index 0.
        animals.remove(String.valueOf("Cat")); // Removing cat, by value.

        System.out.println("The list after deletions:");
        System.out.println(animals);
    }
}
