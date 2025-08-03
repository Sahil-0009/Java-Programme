<<<<<<< HEAD
public class appearOnceAndTwice {
    public static int getSingleEle(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 3, 4, 4, 5, 5 };
        System.out.println(getSingleEle(nums));
    }
}
=======
public class appearOnceAndTwice {
    public static int getSingleEle(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 3, 4, 4, 5, 5 };
        System.out.println(getSingleEle(nums));
    }
}
>>>>>>> 6af294f36f07cebedcb402680b53872868b590eb
