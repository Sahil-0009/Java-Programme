import java.util.Scanner;

public class day1 {
    public static void main(String[] agrs) {
        // System.out.println("Hello World");
        // System.out.print("Hello World");

        // int a, b;
        // a = 1;
        // b = 6;
        // if (a > b) {
        // System.out.println("a is greater than b");
        // } else {
        // System.out.println("b is greater then a");
        // }

        // for (int i = 0; i <= 5; i++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // int i = 0;
        // while (i <= 5) {
        // System.out.print(i + " ");
        // i++;
        // }

        // int i = 0;
        // do {
        // System.out.print(i + " ");
        // i++;
        // } while (i <= 5);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = sc.nextLine();
        // System.out.println("Hello " + name);
        // sc.close();

        // Write a program to calculate the sum of two numbers.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the First number : ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter the Second number : ");
        // int num2 = sc.nextInt();
        // int sum = num1 + num2;
        // System.out.print("The sum of two numbers : " + sum);
        // sc.close();

        // Write a program to check if a number is even or odd.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        // System.out.println("The number is even");
        // } else {
        // System.out.println("The number is odd");
        // }
        // sc.close();

        // Write a program to find the largest of three numbers.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third number : ");
        int c = sc.nextInt();
        if (a > b && b > c) {
            System.out.println("The largest number is :" + a);
        } else if (b > a && a > c) {
            System.out.println("The largest number is :" + b);
        } else {
            System.out.println("The largest number is :" + c);
        }
        sc.close();

    }
}