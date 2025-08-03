package BinarySearch.Binary;

public class IntroBS {
    int bs(int[] nums, int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (target > nums[mid]) {
            return bs(nums, mid + 1, high, target);
        } else {
            return bs(nums, low, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        IntroBS obj = new IntroBS();
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 5;
        int result = obj.bs(nums, 0, nums.length - 1, target);
        System.out.println("The Resultant index of target element : " + result);

    }

}
