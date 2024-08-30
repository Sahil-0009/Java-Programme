
public class RecursionDemo {

    // public static int sum(int k) {
    // if (k > 0) {
    // return k + sum(k - 1);
    // } else {
    // return 0;
    // }
    // }

    // public static void main(String[] args) {
    // int result = sum(10);
    // System.out.println(result);
    // }

    // public static int sum(int start, int end) {
    // if (end > start) {
    // return end + sum(start, end - 1);
    // } else {
    // return end;
    // }
    // }

    // public static void main(String[] args) {
    // int result = sum(5, 10);
    // System.out.println(result);
    // }

    // Print name N times using Recursion

    // public static void printNos(int i, int n) {
    // if (n < 1)
    // return;

    // printNos(i, n - 1);
    // System.out.println(n);

    // }

    // public static void printNos(int i, int sum) {
    // if (i < 1) {
    // System.out.println(sum);
    // return;
    // }
    // printNos(i - 1, sum + i);
    // }
    // public static int printNos(int n) {
    // if (n == 1) {
    // return 1;
    // } else {
    // return n * printNos(n - 1);
    // }
    // }
    // static void f(int i, int arr[], int n) {
    // if (i == n / 2) {
    // return;
    // } else {
    // int temp = arr[i];
    // arr[i] = arr[n - i - 1];
    // arr[n - i - 1] = temp;
    // f(i + 1, arr, n);
    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the size of the array: ");
    // int n = sc.nextInt();
    // int arr[] = new int[n];
    // System.out.print("Enter the element of the array: ");
    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // }
    // sc.close();
    // f(0, arr, n);
    // System.out.println("Reversed array:");
    // for (int i = 0; i < n; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    // static boolean f(int i, String s) {
    // if (i >= s.length() / 2) {
    // return true;
    // } else {
    // if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
    // return f(i + 1, s);
    // } else {
    // return false;
    // }
    // }
    // }

    // public static void main(String[] args) {
    // String s = "madam";
    // System.out.println(f(0, s));
    // }

    int fibo(int n) {

        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        RecursionDemo rd = new RecursionDemo();
        System.out.println(rd.fibo(0));

    }

}
