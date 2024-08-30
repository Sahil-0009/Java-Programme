import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<Integer> set = new HashSet<>();
        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Size
        System.out.println("Size of the set: " + set.size());

        // Print all the element
        System.out.println("Elements in the set: " + set);

        if (set.contains(1)) {
            System.out.println("Set Contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Set does not contain 6");
        }
        // Delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("We deleted 1");
        }

        // Iterator
        @SuppressWarnings("rawtypes")
        Iterator it = set.iterator();
        // hashNext , next
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
