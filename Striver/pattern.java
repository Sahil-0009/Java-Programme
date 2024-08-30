import java.util.Scanner;

public class pattern {
    void patrn1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void patrn2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void patrn3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void patrn4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    void patrn5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void patrn6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void patrn7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void patrn8(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * (n - i + 1) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    void patrn9(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;

            // Print leading spaces
            for (int j = 1; j <= n - stars; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * stars - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    void patrn10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {

            int starts = i;
            if (i > n)
                starts = 2 * n - i;
            for (int j = 1; j <= starts; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    void patrn11(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                start = 0;
            else
                start = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    void patrn12(int n) {
        int space = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print spaces
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();

            // Decrease the number of spaces
            space -= 2;
        }
    }

    void patrn13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }

    void patrn14(int n) {
        for (int i = 0; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }

    void patrn15(int n) {
        for (int i = 0; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }

    void patrn16(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }

    void patrn17(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = i;
            for (int j = 1; j < 2 * i; j++) {
                System.out.print(ch);
                if (j < breakPoint)
                    ch++;
                else
                    ch--;
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void patrn18(int n) {
        for (int i = 0; i <= n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void patrn19(int n) {
        int iniS = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
        }
        iniS = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            iniS -= 2;
            System.out.println();

        }
    }

    void patrn20(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i < 2 * n; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;

            // Print stars on the left side
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Print spaces in the middle
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print stars on the right side
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            // Adjust the number of spaces
            if (i < n)
                spaces -= 2;
            else
                spaces += 2;
        }
    }

    void patrn21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void patrn22(int n) {

        for (int i = 0; i < 2 * n - 1; i++) {

            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int bottom = j;
                int right = (2 * n - 2) - j;
                int left = (2 * n - 2) - i;

                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");

        n = sc.nextInt();
        pattern p = new pattern();
        p.patrn22(n);

        sc.close();
    }
}
