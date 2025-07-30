package Practice;

import java.util.Scanner;

// // class ageCal {
// //     int ages[] = { 120, 34, 56, 87, 89, 97 };
// //     Float avg, sum = (float) 0;
// //     int length = 0;

// //     public void calculate() {
// //         length = ages.length;
// //         // for (int age : ages) {
// //         // sum += age;
// //         // }
// //         // avg = sum / length;
// //         // System.out.println("The avg is : " + avg);
// //         int lowestAge = ages[0];
// //         for (int age : ages) {
// //             if (lowestAge > age) {
// //                 lowestAge = age;
// //             }
// //         }
// //         System.out.println("The lowest age is : " + lowestAge);
// //     }
// // }

// public class Array {
//     // static String cars[] = { "Velvo", "BMW", "Ford", "Mazda" };

//     public static void main(String[] args) {

//         // cars[0] = "SUV";
//         // System.out.println("Cars in the array are:");

//         // // for (int i = 0; i < cars.length; i++) {
//         // // System.out.println(cars[i]);

//         // for (String i : cars) {

//         // System.out.println(i);
//         // }
//         // System.out.println("The Number of Cars : " + cars.length);

//         // ageCal cal = new ageCal();
//         // cal.calculate();

//         // System.out.println("The sum is : " + cal.sum);
//         // System.out.println("The avg is : " + cal.avg);

//         int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
//         // System.out.println(myNumbers[0][3]);

//         for (int i = 0; i < myNumbers.length; i++) {
//             for (int j = 0; j < myNumbers[i].length; j++) {
//                 System.out.println(myNumbers[i][j]);
//             }
//         }

//     }
// }
// Reverse Array 
public class Array {

    // public static void reverseArray(int[] array) {

    // int start = 0;
    // int end = array.length - 1;
    // while (start < end) {
    // int temp = array[start];
    // array[start] = array[end];
    // array[end] = temp;

    // start++;
    // end--;
    // }
    // }

    // public static void printArray(int[] array) {
    // for (int elem : array) {
    // System.out.print(elem + " ");
    // }
    // System.out.println();
    // }

    // public static void main(String[] args) {
    // int[] array = { 1, 2, 3, 4, 5 };

    // System.out.println("Original array: ");
    // printArray(array);

    // reverseArray(array);
    // System.out.println("Reversed array: ");

    // printArray(array);
    // }

    public static void main(String[] args) {
        // int marks[] = new int[3];
        // marks[0] = 90;
        // marks[1] = 80;
        // marks[2] = 70;

        // int marks[] = { 90, 80, 70 };

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for (int mark : marks) {
        // System.out.println(mark);
        // }

        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index : " + i);
            }
            // System.out.println(numbers[i]);
        }
        sc.close();
    }
}
