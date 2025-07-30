public class clone {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        int[][] cloneArr = arr.clone();
        for (int[] e : cloneArr) {
            for (int[] f : cloneArr) {
                System.out.print(f + " ");
            }

        }
    }
}
