import java.util.Arrays;

public class ArrCls {
    public static void main(String[] args) {
        int intArr[] = { 11, 22, 3, 4, 5 };
        System.out.println(Arrays.toString(intArr));

        System.out.println("Integer Array : " + Arrays.toString(Arrays.copyOfRange(intArr, 1, 3)));
        // Arrays.sort(intArr);
        // int key = 22;
        // System.out.println(key + " found at index : " + Arrays.binarySearch(intArr,
        // key));
        // System.out.println("Integer Array as list : " + Arrays.asList(intArr));
    }
}
