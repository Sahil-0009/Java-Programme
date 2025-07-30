import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("The sum of two numbers : " + (a + b));
        sc.close();
    }
}