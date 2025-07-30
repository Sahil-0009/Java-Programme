public class cont {
    public static void main(String[] args) {
        // int n = 0;
        // for (int i = 0; i < n; i++) {
        // if (i == 3)
        // continue;
        // System.out.print(i + (", "));
        // }
        // while (n < 5) {
        // if (n == 3) {
        // n++;
        // continue;
        // }
        // System.out.print(n + " ");
        // n++;
        // }
        // int i = 0;
        // do {
        // if (i == 3) {
        // i++;
        // continue;
        // }
        // System.out.print(i + " ");
        // i++;
        // } while (i <= 5);
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 0; j <= 5; j++) {
        // if (i == 3 && j == 4) {
        // continue;
        // }
        // System.out.print(i + "." + j + " ");
        // }
        // System.out.println();
        // }
        for (int i = 0; i <= 10; i++) {
            if (i == 3)
                continue;

            if (i == 7)
                break;

            System.out.print(i + " ");
        }
    }
}
