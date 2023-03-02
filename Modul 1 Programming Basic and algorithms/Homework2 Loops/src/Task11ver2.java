/*
Незапълнен триъгълник
Въведете число N чрез конзолата и изкарайте като
резултат следния триъгълник с височина N:
             *
            * *
           *****
 */

import java.util.Scanner;

public class Task11ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло положително число:");
        int n = scanner.nextInt();

        for (int row = 1; row <= n; row++) {
            if (row == n) {
                for (int i = 1; i <= (2 * row) - 1; i++) {
                    System.out.print("*");
                }
                break;
            }

            for (int space = 0; space < (n - row); space++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if (row == 1) {
                System.out.println();
                continue;
            }

            for (int space = 1; space < 2 * (row - 1); space++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
