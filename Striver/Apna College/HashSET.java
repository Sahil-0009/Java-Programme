import java.util.HashSet;
import java.util.Iterator;

public class HashSET {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();
        // Insert
        set.add(1);
        set.add(2);
        set.add(1);
        // Print all element
        System.out.println("the set is " + set);
        // Size of the set
        System.out.println("the size of the set is " + set.size());

        // Search - contains
        if (set.contains(1)) {
            System.out.println("Element 1 is present");
        }

        // // Delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("Element 1 is deleted");
        }

        // Iterator
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());

        }

    }
}