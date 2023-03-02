/*
Да се въведат от потребителя 2 числа. И да се
изведат на екрана всички числа от по-малкото до по-голямото.
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете число а:");
        int a = scanner.nextInt();
        System.out.println("Моля, въведете число b:");
        int b = scanner.nextInt();

        if (a >= b) {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }
}
