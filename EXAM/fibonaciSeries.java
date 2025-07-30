public class fibonaciSeries {
    static void Fibonacci(int N) {
        int num1 = 0, num2 = 1;
        for (int i = 0; i < N; i++) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }

    public static void main(String[] args) {

        int N = 10;
        Fibonacci(N);
    }
}
