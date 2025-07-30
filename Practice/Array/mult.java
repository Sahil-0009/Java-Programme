package Array;

public class mult {
    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array values : " + sum);
    }

    public static void main(String[] args) {
        // int[][] arr = new int[3][4];
        // System.out.println("Rows : " + arr.length);
        // System.out.println("Columns : " + arr[0].length);

        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        int arr[] = { 1, 2, 3, 4, 5 };
        sum(arr);
    }
}
