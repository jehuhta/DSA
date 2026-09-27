import java.util.ArrayList;

public class forloop2 {
    
static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] Args) {

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Retrieves the value from the index.
        System.out.println(numbers.get(2));

        // Grabs the index based on the value. 
        System.out.println(numbers.indexOf(2));

        // Using a for-loop to std-out each number. 
        System.out.println("List of numbers:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // // Enumerated for-loop.
        // for (i = 0, i < numbers.size(); i++) {
        //     System.out.println(numbers.get(i));
        // }

    }
}
