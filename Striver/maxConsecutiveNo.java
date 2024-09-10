public class maxConsecutiveNo {

    public static int maxConsecutive(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 3, 4, 1, 1, 1, 2, 1 };
        System.out.println("The consecutive 1's is " + maxConsecutive(nums));

    }
}
