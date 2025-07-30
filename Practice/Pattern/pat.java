package Pattern;

// import java.util.Scanner;

public class pat {
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printPattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // static void printPattern123(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= n; j++) {
    // if (i == 1 || i == n || j == 1 || j == n) {
    // System.out.print("* ");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        printPattern(5);

        printPattern2(5);

        // System.out.println("Pattern 3:");
        // printPattern123(5);
    }
}
