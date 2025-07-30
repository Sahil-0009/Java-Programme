public class checkArmStrong {
    static boolean isArmstrong(int n) {
        int sum = 0;
        int temp = n;

        while (temp != 0) {
            int rem = temp % 10;
            temp /= 10;
            sum = sum + (rem * rem * rem);
        }

        return sum == n;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));
    }
}
