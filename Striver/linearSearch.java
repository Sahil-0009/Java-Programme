import java.util.Scanner;

public class linearSearch {
    public static int FindEle(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("Enter the element to be searched");
        int n = sc.nextInt();
        int index = FindEle(a, n);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }

}
