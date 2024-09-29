import java.util.*;

public class liskedListCollection {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("Apple");
        list.addFirst("Banana");
        list.addFirst("Cherry");
        System.out.println(list);

        list.addLast("This");
        list.addLast("is");
        list.addLast("a");
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
