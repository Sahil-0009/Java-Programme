package BinarySearch;

public class rotatedSortarry2 {
    boolean rotatedArry(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return true;
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] == x)
                    return true;
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
        return false;
    }

    public static void main(String[] args) {
        rotatedSortArry obj = new rotatedSortArry();
        int[] arr = { 3, 5, 2, 3, 3, 3, 3, 3 };
        int x = 3;
        System.out.println(obj.rotatedArry(arr, arr.length, x));
    }
}
