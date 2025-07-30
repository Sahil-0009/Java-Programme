import java.util.Arrays;
import java.util.List;

public class cls98 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 30, 4);
        // int sum = 0;
        // for (int n : nums) {
        // if (n % 2 == 0) {
        // n = n * 2;
        // sum = sum + n;
        // }
        // }
        nums.forEach(n -> System.out.println(n));
        // System.out.println(nums);
    }
}
