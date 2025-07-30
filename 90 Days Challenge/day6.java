public class day6 {

    public static void print(int n) {
        printHelper(1, n);
    }

    private static void printHelper(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(n - i + 1);

        printHelper(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
