/*
Да се състави програма, която извежда всички
естествени трицифрени числа, които имат сбор на цифрите равен
на дадено число.
Дадено : sum, където 2>=sum<=27.
Пример: 26
Изход: 899, 989, 998.
 */

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля, въведете цяло положително число sum [2 ..27]:");
        int sum = scanner.nextInt();

        for (int i = 100; i < 999; i++) {
            if (sum == (i / 100) + ((i / 10) % 10) + (i % 10)) {
                System.out.println(i);
            }
        }
    }
}
