package BinarySearch;

public class upperBound {
    int upperB(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        upperBound ub = new upperBound();
        int result = ub.upperB(arr, n, 6);
        System.out.println("The upper bound is the index: " + result);
    }
}
