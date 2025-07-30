public class NumConversion {

    // Method to convert Binary to Decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0, power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    // Method to convert Decimal to Octal
    public static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            octal.insert(0, decimal % 8); // Append remainder to the left
            decimal /= 8;
        }
        return octal.toString();
    }

    // Method to convert Decimal to Hexadecimal
    public static String decimalToHexadecimal(int decimal) {
        StringBuilder hex = new StringBuilder();
        char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        while (decimal > 0) {
            hex.insert(0, hexDigits[decimal % 16]); // Get the corresponding hex character
            decimal /= 16;
        }
        return hex.toString();
    }

    public static void main(String[] args) {
        String binary = "101101"; // Example binary number

        // Convert Binary to Decimal first
        int decimal = binaryToDecimal(binary);

        // Convert Decimal to Octal
        String octal = decimalToOctal(decimal);

        // Convert Decimal to Hexadecimal
        String hex = decimalToHexadecimal(decimal);

        // Output the results
        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
    }
}
// // Java program to convert a decimal
// // number to hexadecimal number
// import java.io.*;

// class GFG {
// // function to convert decimal to hexadecimal
// static void decToHexa(int n)
// {
// // char array to store hexadecimal number
// char[] hexaDeciNum = new char[100];

// // counter for hexadecimal number array
// int i = 0;
// while (n != 0) {
// // temporary variable to store remainder
// int temp = 0;

// // storing remainder in temp variable.
// temp = n % 16;

// // check if temp < 10
// if (temp < 10) {
// hexaDeciNum[i] = (char)(temp + 48);
// i++;
// }
// else {
// hexaDeciNum[i] = (char)(temp + 55);
// i++;
// }

// n = n / 16;
// }

// // printing hexadecimal number array in reverse
// // order
// for (int j = i - 1; j >= 0; j--)
// System.out.print(hexaDeciNum[j]);
// }

// // driver program
// public static void main(String[] args)
// {
// int n = 2545;
// decToHexa(n);
// }
// }

// Java program to convert a decimal
// number to octal number
// import java.io.*;

// class GFG {
// // Function to convert decimal to octal
// static void decToOctal(int n)
// {
// // array to store octal number
// int[] octalNum = new int[100];

// // counter for octal number array
// int i = 0;
// while (n != 0) {
// // storing remainder in octal array
// octalNum[i] = n % 8;
// n = n / 8;
// i++;
// }

// // Printing octal number array in reverse order
// for (int j = i - 1; j >= 0; j--)
// System.out.print(octalNum[j]);
// }

// // Driver Code
// public static void main(String[] args)
// {
// int n = 33;

// // Function Call
// decToOctal(n);
// }
// }
