import java.util.Scanner;

public class day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n;
        // n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

        // // precompute:
        // int[] hash = new int[13];
        // for (int i = 0; i < n; i++) {
        // hash[arr[i]] += 1;
        // }

        // int q;
        // q = sc.nextInt();
        // while (q-- != 0) {
        // int number;
        // number = sc.nextInt();
        // // fetching:
        // System.out.println(hash[number]);
        // }
        String s = sc.next();

        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a'] += 1;
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            System.out.println(hash[c - 'a']);
        }

        sc.close();
    }
}