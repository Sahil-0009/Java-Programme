package practice;

public class secLargestEle {
    static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > first) {
                second = first;
                first = i;
            } else if (i > second && i != first) {
                second = i;
            }
        }
        return second;
    }

    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    static void moveZerosToEnd(int[] arr) {
        int count = 0; // Count of non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; // Move non-zero elements to the front
            }
        }
        while (count < arr.length) {
            arr[count++] = 0; // Fill remaining positions with zeros
        }
        System.out.println("Array after moving zeros to end:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int missingNum(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        for (int i : arr) {
            total -= i; // Subtract each element from the total
        }
        return total;
    }

    void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void rotateLeftByOne(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        System.out.println("Array after left rotation by one:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void frequencyCount(int[] arr, int n) {
        int[] freq = new int[n + 1];
        for (int num : arr) {
            if (num <= n)
                freq[num]++;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " -> " + freq[i]);
        }

    }

    public static void main(String[] args) {
        // int[] arr = { 12, 0, 1, 10, 34, 1 };
        // System.out.println("Second largest element is: " + findSecondLargest(arr));
        // System.out.println("Array is sorted: " + isSorted(arr));
        // moveZerosToEnd(arr);

        // int[] arr = { 1, 2, 3, 4, 5 };

        // secLargestEle a = new secLargestEle();
        // int n = arr.length;
        // System.out.println("Missing number is: " + missingNum(arr, n + 1));
        // a.reverseArray(arr);
        // secLargestEle.rotateLeftByOne(arr);
        int[] freqArr = { 1, 2, 2, 3, 3, 3 };
        secLargestEle.frequencyCount(freqArr, 3);

    }

}
