import java.util.Arrays;

public class TernarySearch {
    public static int search(int arr[], int low, int high, int key) {
        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3; 

            if (arr[mid1] == key) {
                return mid1;
            }
            if (arr[mid2] == key) {
                return mid2;
            }

            if (key < arr[mid1]) {
                return search(arr, low, mid1 - 1, key);
            } else if (key > arr[mid2]) {
                return search(arr, mid2 + 1, high, key);
            } else {
                return search(arr, mid1 + 1, mid2 - 1, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 2, 354, 4, 50, 30 };
        Arrays.sort(arr); 
        int key = 30;
        int n = arr.length;
        int result = search(arr, 0, n - 1, key);

        if (result != -1) {
            System.out.println("Element is present at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
