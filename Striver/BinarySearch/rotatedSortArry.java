package BinarySearch;

public class rotatedSortArry {
    int rotatedArry(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[low] <= arr[mid]) {
                if (arr[low] == x)
                    return low;
                if (arr[low] <= x && x < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (arr[mid] < x && x <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        rotatedSortArry obj = new rotatedSortArry();
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int x = 0;
        int result = obj.rotatedArry(arr, arr.length, x);
        System.out.println(result);
    }
}