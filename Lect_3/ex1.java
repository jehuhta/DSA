import java.util.TreeSet;

// This program counts the number of duplicates in a string.
public class ex1 {
    
    public static int duplicateCounter(String text) {

        text = text.toLowerCase();

        // Create a TreeSet
        TreeSet<Character> characters = new TreeSet<>();

        // Create an incrementer.
        int duplicates = 0;

        // Starting at 0, for the whole text length, inc by 1...
        for (int i = 0; i < text.length(); i++) {

            // Get the newest character from the index.
            char character = text.charAt(i);
        
            // Ignoring punctuation
            if (Character.isLetterOrDigit(character)) {

                // Try to add the character to the Tree set.
                // If you place a duplicate into a tree set, it will output True
                // ! <-- means it checks for the True
                //   <-- without it, it will check for False.
                // If it returns True, the duplicates int incremenents by 1
                if (!characters.add(character)) {
                    duplicates++;
                }
            }
        }

        // Then, return the number of duplicates!
        return duplicates;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCounter("CHICKEN"));
        System.out.println(duplicateCounter("Cow.![]12938"));
    }
}