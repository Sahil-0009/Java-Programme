
public class day7 {
    // public static int factorial(int n) {
    // // if (n == 0) {
    // // return 1;
    // // }
    // // return n * factorial(n - 1);
    // int result = 1;
    // for (int i = 1; i <= n; i++) {
    // result *= i;
    // }
    // return result;
    // }

    // static void reverseArray(int[] arr, int start, int end, int n) {
    // if (start >= end) {
    // return;
    // }
    // while (start < end) {

    // int temp = arr[start];
    // arr[start] = arr[end];
    // arr[end] = temp;
    // start++;
    // end--;
    // }
    // reverseArray(arr, start + 1, end - 1, n);

    // }

    // static void reverseArray(Integer arr[]) {
    // Collections.reverse(java.util.Arrays.asList(arr));
    // }

    static void palindrome(String str, int i) {
        // String reversed = new StringBuilder(str).reverse().toString();
        // if (str.equals(reversed)) {
        // System.out.println(str + " is a palindrome.");
        // } else {
        // System.out.println(str + " is not a palindrome.");
        // }
        if (i >= str.length() / 2) {
            System.out.println(str + " is a palindrome.");
            return;
        }
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
            System.out.println(str + " is not a palindrome.");
            return;
        }
        palindrome(str, i + 1);
    }

    public static void main(String[] args) {
        // System.out.println("Hello, Day 7!");
        // int result = factorial(5);
        // System.out.println("Factorial: " + result);
        // Integer[] arr = { 1, 2, 3, 4, 5 };
        // reverseArray(arr);
        // System.out.print("Reversed Array: ");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        String str = "madam";
        palindrome(str, 0);
    }
}
