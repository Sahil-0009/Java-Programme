import java.util.stream.IntStream;

public class intStream {
    public static void main(String[] args) {
        int arr1[] = IntStream.range(1, 5).toArray(); // [1, 2, 3]
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        int arr2[] = IntStream.rangeClosed(1, 4).toArray(); // [1, 2, 3, 4]
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();

        int arr3[] = IntStream.of(1, 2, 3, 4).toArray(); // [1, 2, 3, 4]
        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }
}
