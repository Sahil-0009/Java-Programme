public class arr2 {
    public static void main(String[] args) {
        int nums[][][] = new int[3][4][5]; // jagged

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    nums[i][j][k] = (int) (Math.random() * 10);
                    System.out.print(nums[i][j][k] + "  ");
                }
                System.out.println();
            }

        }
    }
}
