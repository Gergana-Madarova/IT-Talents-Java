/*
Да се прочете число от екрана(конзолата) и да се
изведе сбора на всички числа между 1 и въведеното число.
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете число а:");
        int a = scanner.nextInt();
        int sum = 0;

        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                sum += i;
            }
            // ако се въведе цяло, но отрицателно число
        } else if (a < 0) {
            for (int i = 1; i >= a; i--) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
