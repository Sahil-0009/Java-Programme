package Practice;

import java.util.Scanner;

public class TwodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (numbers[i][j] == x) {

                    System.out.print("x found at locations (" + i + "," + j + ")");
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
