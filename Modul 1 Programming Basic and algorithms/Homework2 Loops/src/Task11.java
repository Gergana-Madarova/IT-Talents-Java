/*
Въведете число N чрез конзолата и изкарайте като
резултат следния триъгълник с височина N:
             *
            ***
           *****
      .................
Кaто допълнително упражнение – нарисувайте същия
триъгълник, но незапълнен.
 */


import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло положително число:");
        int n = scanner.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < (n - row); space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < (2 * row - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
