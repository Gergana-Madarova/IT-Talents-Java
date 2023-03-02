/*
Започвайки от 3, да се изведат на екрана първите n
числа които се делят на 3. Числата да са разделени със запетая.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете цяло положително число!");
        int n = scanner.nextInt();
        int number = 3;

        for (int i = 1; i <= n; i++) {
            System.out.print(number + ", ");
            number += 3;
        }
    }
}