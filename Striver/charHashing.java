import java.util.Scanner;

public class charHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to input a string
        System.out.println("Enter a string: ");
        String s = sc.next();

        // Create an array to store the frequency of each character in the string
        int[] hash = new int[26];

        // Populate the frequency array based on the input string
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        // Ask the user how many characters' frequencies they want to query
        System.out.println("Enter the number of characters to query: ");
        int q = sc.nextInt();

        // Loop to get character queries from the user
        while (q-- > 0) {
            System.out.println("Enter a character: ");
            char c = sc.next().charAt(0); // Get the first character of the input string

            // Output the frequency of the queried character
            System.out.println("Frequency of '" + c + "' is " + hash[c - 'a']);
        }

        // Close the scanner
        sc.close();

    }
}
