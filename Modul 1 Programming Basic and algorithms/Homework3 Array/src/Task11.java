/*
Да се състави програма, която въвежда от клавиатурата 7 цели числа
в едномерен масив
Програмата да изведе всички числа кратни на 5, но по големи от 5.
Пример: -23, -55, 17, 75, 56, 105, 134
Изход: 75,105 - 2 числа
 */

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете 7 цели числа:");
        int[] array = new int[7];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i] > 5) {
                count++;
                System.out.print(array[i] + " ");
            }
        }

        System.out.println("- " + count + " числа");
    }
}
