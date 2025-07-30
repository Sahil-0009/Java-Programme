public class evenOrOdd {
    static void CheckEvenOrOdd(int n) {
        if (n % 2 == 0)
            System.out.println(n + " is even");
        else
            System.out.println(n + " is odd");
    }

    public static void main(String[] args) {
        int n = 11;
        CheckEvenOrOdd(n);
    }
}
