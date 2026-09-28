import java.util.LinkedList;

// This program counts the number of duplicates in a string. 
// THIS PROGRAM ASSUMED BOTH LISTS ARE THE SAME LENGTH.
public class ex5 {

    public static LinkedList<Integer> listMerger(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        
        // Create a LinkedList
        LinkedList<Integer> mergedlist = new LinkedList<>();

        //  Starting at index 0...
        // Until list1's size is max.
        // incrementing by 1...
        for(int i=0; i < list1.size(); i++) {
            // Add list1's number by index i.
            mergedlist.add(list1.get(i));
            // Add list2's number by index i.
            mergedlist.add(list2.get(i));
        }

        // Return the linkedlist.
        return mergedlist;
    }


    

    public static void main(String[] args) {

        // Create two lists
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // Add four numbers in list one.
        list1.add(2);
        list1.add(2);
        list1.add(2);
        list1.add(2);

        // And now, we add four numbers in list two.
        list2.add(9);
        list2.add(9);
        list2.add(9);
        list2.add(9);

        // Use the method and print out the function.
        System.out.println(listMerger(list1, list2));
    }
}