import java.util.ArrayList;

public class day5 {
    public static ArrayList<Integer> findDivisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> divisors = findDivisors(36);
        System.out.println("Divisors of 36: " + divisors);
    }

}
