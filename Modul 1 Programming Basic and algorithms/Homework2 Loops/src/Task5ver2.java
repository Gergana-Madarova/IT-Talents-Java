/*
Да се въведат от потребителя 2 числа. И да се
изведат на екрана всички числа от по-малкото до по-голямото.
 */

import java.util.Scanner;

public class Task5ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете число а:");
        int a = scanner.nextInt();
        System.out.println("Моля, въведете число b:");
        int b = scanner.nextInt();

        int min = (a >= b) ? b : a;
        int max = (a < b) ? b : a;
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }
}
