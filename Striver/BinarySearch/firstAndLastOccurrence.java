package BinarySearch;

public class firstAndLastOccurrence {

    // Function to find the first occurrence (lower bound)
    int lowerB(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                // We want to find the first occurrence, so move towards left
                if (arr[mid] == x)
                    ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    // Function to find the last occurrence (upper bound)
    int upperB(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > x) {
                high = mid - 1;
            } else {
                if (arr[mid] == x)
                    ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        firstAndLastOccurrence obj = new firstAndLastOccurrence();
        int[] arr = { 1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9 }; // Example sorted array
        int n = arr.length;
        int x = 2; // Element to find the first and last occurrence of

        // Finding the first occurrence (lower bound)
        int lb = obj.lowerB(arr, n, x);
        // If x is not found, return [-1, -1]
        if (lb == n || arr[lb] != x) {
            System.out.println("First and Last Occurrence: [-1, -1]");
        } else {
            // Finding the last occurrence (upper bound)
            int ub = obj.upperB(arr, n, x);
            System.out.println("First Occurrence: " + lb + ", Last Occurrence: " + ub);
        }
    }
}
