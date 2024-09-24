import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        // ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Add element
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        // get element
        int element = list.get(0);
        System.out.println(element);

        // add element in between
        list.add(1, 10);
        System.out.println(list);

        // Set element
        list.set(1, 1);
        System.out.println(list);

        // delete element
        list.remove(0);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        // Iterator

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
