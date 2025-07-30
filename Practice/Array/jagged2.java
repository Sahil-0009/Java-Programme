import java.util.Scanner;

public class jagged2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sub-array: ");
        int numberOfArrays = sc.nextInt();

        int[][] jaggedArray = new int[numberOfArrays][];

        for (int i = 0; i < numberOfArrays; i++) {
            System.out.println("Enter the size of sub-array " + (i + 1) + " : ");
            int sizeOfArray = sc.nextInt();
            jaggedArray[i] = new int[sizeOfArray];
        }
        for (int i = 0; i < numberOfArrays; i++) {
            System.out.println("Enter the elements of sub-array " + (i + 1) + ":");

            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("The jagged array is:");
        for (int i = 0; i < numberOfArrays; i++) {

            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
