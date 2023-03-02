/*
 По зададено число n, да се изведе на екрана таблица
 Въведете n:
4
3333
5555
7777
9999
 */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете цяло положително число!");
        int n = scanner.nextInt();
        int num = n - 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(num);
            }
            num += 2;
            System.out.println();
        }
    }
}
