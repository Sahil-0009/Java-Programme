package BinarySearch;

public class lowerBound {
    int lowerB(int[] arr, int n, int x) {
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
        int n = arr.length;
        lowerBound lb = new lowerBound();
        int result = lb.lowerB(arr, n, 7);
        System.out.println(result);
    }

    public int searchInsertP(int[] arr, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchInsertP'");
    }
}
