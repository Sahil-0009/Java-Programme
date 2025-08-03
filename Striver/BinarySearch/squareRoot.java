<<<<<<< HEAD

package BinarySearch;

public class squareRoot {
    public int sqrt(int n) {
        if (n == 0 || n == 1)
            return n;
        int low = 1, high = n, ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == n)
                return mid;
            if (mid * mid < n) {
                low = mid + 1;
                ans = mid;
            } else {
                high = mid - 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        // Linear Approach
        // int n = 9;
        // int ans = 1;
        // for (int i = 1; i <= n; i++) {
        // if (i * i == n) {
        // ans = i;
        // } else if (i * i > n) {
        // ans = i - 1;
        // break;
        // }
        // }
        // System.out.println("The square root of " + n + " is " + ans);
        squareRoot sq = new squareRoot();
        int ans = sq.sqrt(9);
        System.out.println(ans);

    }

=======

package BinarySearch;

public class squareRoot {
    public int sqrt(int n) {
        if (n == 0 || n == 1)
            return n;
        int low = 1, high = n, ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == n)
                return mid;
            if (mid * mid < n) {
                low = mid + 1;
                ans = mid;
            } else {
                high = mid - 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        // Linear Approach
        // int n = 9;
        // int ans = 1;
        // for (int i = 1; i <= n; i++) {
        // if (i * i == n) {
        // ans = i;
        // } else if (i * i > n) {
        // ans = i - 1;
        // break;
        // }
        // }
        // System.out.println("The square root of " + n + " is " + ans);
        squareRoot sq = new squareRoot();
        int ans = sq.sqrt(9);
        System.out.println(ans);

    }

>>>>>>> 6af294f36f07cebedcb402680b53872868b590eb
}