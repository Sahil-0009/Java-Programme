package BinarySearch;

public class searchInsertPosition {
    int searchInsertP(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;
        if (low <= high) {
            int mid = low + (high - low) / 2;
            while (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            }

            low = mid + 1;

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        searchInsertPosition lb = new searchInsertPosition();
        int result = lb.searchInsertP(arr, 7);
        System.out.println(result);
    }
}