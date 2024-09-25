import java.util.Scanner;

public class bitManipulation {
    public static void main(String[] args) {
        // GET BIT

        int n = 5; // 0101
        int pos = 2; // at the position 2, the elemnt is 1
        int bitMask = 1 << pos; // 0100
        if ((bitMask & n) == 0) {
            System.out.println("Bit was Zero");
        } else {
            System.out.println("Bit was One");
        }

        // SET BIT
        int n1 = 5; // 010
        int pos1 = 1; // Convert the number if 1 then it changes to 0 vice-verse
        int bitMask1 = 1 << pos1; // 0010
        int newNum = n1 | bitMask1; // 0101
        System.out.println(newNum);

        // Clear Bit
        int n2 = 5; // 0101
        int pos2 = 2; // Convert the number if 1 then it changes to 0 vice-verse
        int bitMask2 = 1 << pos2; // 0100
        int newNum2 = n2 & ~bitMask2; // 0001
        System.out.println(newNum2);

        // Update Bit
        Scanner sc = new Scanner(System.in); // for user input
        int oper = sc.nextInt();
        // oper = 1 : SET oper = 0 : Clear
        int n3 = 5; // 0101
        int pos3 = 1;
        int bitMask3 = 1 << pos3; // 0010
        if (oper == 1) {
            // SET
            int newNum3 = n3 | bitMask3; // 0101
            System.out.println(newNum3);
        } else {
            // Clear
            int newNum3 = n3 & ~bitMask3; // 0001
            System.out.println(newNum3);
        }
        sc.close();

    }
}
